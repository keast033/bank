package com.example.demo.cust.service.impl;

import com.example.demo.cust.dao.SinDataMapper;
import com.example.demo.cust.pojo.cust.SinData;
import com.example.demo.cust.service.SinDataService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
/**
 * SinDataServiceImpl class
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
public class SinDataServiceImpl implements SinDataService {
    @Autowired
    private SinDataMapper sinDataMapper;
    private ArrayList<String> userIdList;
    @Override
    public ArrayList<String> getAllMobile() {
        for (SinData data :sinDataMapper.getAllSinData()){
            userIdList.add(data.getMobile());
        }
        return userIdList;
    }
}
