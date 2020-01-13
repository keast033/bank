package com.example.demo.cust.service;

import java.util.ArrayList;
/**
 * SinDataService interface
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
public interface SinDataService {
    /**
     * 获取所有VIP客户的手机号码
     *
     * @return ArrayList<String> 手机号码集合
     */
    public ArrayList<String> getAllMobile();
}
