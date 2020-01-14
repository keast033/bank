package com.example.demo.cust.service.impl;

import com.example.demo.cust.dao.CustMapper;
import com.example.demo.cust.dao.SinDataMapper;
import com.example.demo.cust.pojo.Cust;
import com.example.demo.cust.pojo.cust.CustInfo;
import com.example.demo.cust.pojo.cust.SinData;
import com.example.demo.cust.service.CustService;
import com.example.demo.cust.util.MD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
/**
 * CustServiceImpl class
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
@Service
public class CustServiceImpl implements CustService {

    @Autowired
    private CustMapper custMapper;
    @Autowired
    private SinDataMapper sinDataMapper;

    private CustInfo custInfo;

    private Cust cust;

    /**
     * app_key
     * 人脸识别机器app_key
     */
    private static String APP_KEY="b9a3cd69619bfefd";

    /**
     * sign
     * 存储时间戳与密文
     */
    private String[] sign;

    /**
     * date
     * 对时间进行比对，以确认是否是最新的VIP访客数据
     */
    private String date = "";


    @Override
    public Cust getCustByIdNo(String idNo) {
        return custMapper.getCustByIdno(idNo);
    }

    //    @Override
//    public Cust getCustByIdNo(String idNo) {
//        return custMapper.getCustByIdNo(idNo);
//    }
    @Override
    public CustInfo getRecords() {
        RestTemplate restTemplate = new RestTemplate();
        sign = MD.signMD5();

        return restTemplate.getForObject("http://192.168.2.187/api/v1/record?app_key=" +APP_KEY+
                        "&timestamp=" +sign[0]+
                        "&sign="+sign[1]
                ,CustInfo.class);
    }

    @Override
    public SinData checkVIP() {
        //存放所有已知的VIP的userId,每次调用该方法都会创建一个新的List集合，此处可优化
        List<String> idList= new ArrayList<String>();
        custInfo = getRecords();

        //未链接数据库 为方便测试暂时注解
        idList=sinDataMapper.getAllVIPMobile();

        for(SinData sindata : custInfo.getData().getData()){
            //判断客户类型是否是访客且客户的userId是否在VIP中存在
            if(sindata.getType()==2&&idList.indexOf(sindata.getMobile())!=-1){
                //第一次VIP识别时对时间进行初始化
                if(date.equals("")){
                    date=sindata.getSignTime();
                    System.out.println("时间初始化");
                    System.out.println("识别到最新的VIP客户记录！");
                    return sindata;
                }
                //查询到的访客记录是由新到旧排列，即能保证查询到的第一个VIP到访记录为最新的
                if(sindata.getSignTime().equals(date)){
                    System.out.println("没有新的VIP客户记录");
                    return null;
                }
                date=sindata.getSignTime();
                System.out.println("识别到最新的VIP客户记录！");
                return sindata;
            }
        }
        System.out.println("未识别到记录中的VIP客户");
        return null;
    }

    @Override
    public Cust getCustByMobile(String mobile) {
        Cust cust = custMapper.getCustByMobile(mobile);
        return cust;
    }
}
