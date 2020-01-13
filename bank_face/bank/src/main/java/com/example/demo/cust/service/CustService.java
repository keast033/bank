package com.example.demo.cust.service;

import com.example.demo.cust.pojo.Cust;
import com.example.demo.cust.pojo.cust.CustInfo;
import com.example.demo.cust.pojo.cust.SinData;
/**
 * CustService interface
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
public  interface CustService {
    /**
     * 根据身份证号码查询对应的客户业务办理状态
     *
     * @param idNo 身份证号码
     * @return Cust 客户信息
     */
    public Cust getCustByIdNo(String idNo);

    /**
     * 访问人脸识别机器服务器，读取最近的20条人脸识别记录，并注入到客户识别记录中
     *
     * @return CustInfo 客户识别记录
     */
    public CustInfo getRecords();

    /**
     * 根据人脸识别记录检出最新的VIP访问记录
     *
     * @return SinData 单个客户信息
     */
    public SinData checkVIP();

    /**
     * 根据手机号码检出对应客户的业务办理状态
     *
     * @param mobile 手机号码
     * @return Cust 单个客户相关业务的办理状态
     */
    public Cust getCustByMobile(String mobile);
}
