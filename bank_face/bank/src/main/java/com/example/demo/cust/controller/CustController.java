package com.example.demo.cust.controller;

import com.example.demo.cust.pojo.Cust;
import com.example.demo.cust.pojo.Result;
import com.example.demo.cust.pojo.cust.SinData;
import com.example.demo.cust.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * CustController class
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
@CrossOrigin
@RestController
@RequestMapping("/cust")
public class CustController {

    @Autowired
    private CustService custService;

    private SinData sinData;
    private Cust cust;

    @RequestMapping(value = "getRecords", method = RequestMethod.GET)
    public Cust getRecords(String idNo) {
        cust = custService.getCustByIdNo(idNo);
        return cust;
    }

    @RequestMapping(value = "checkVIP",method = RequestMethod.GET)
    public Cust checkVIP(){
        //自定义结果集出现问题，暂时用直接的数据代替
        sinData = custService.checkVIP();
        Result result = new Result();
        if(sinData!=null){
            cust=custService.getCustByMobile(sinData.getMobile());
            result.success(cust);
            return cust;
        }
        result.faild();
        return null;
    }
}
