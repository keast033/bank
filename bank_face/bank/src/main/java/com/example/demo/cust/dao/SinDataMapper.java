package com.example.demo.cust.dao;

import com.example.demo.cust.pojo.cust.SinData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
/**
 * SinDataMapper interface
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
@Mapper
@Repository
public interface SinDataMapper {
    /**
     * 取出所有的VIP客户的信息集合
     *
     * @return ArrayList<SinData> 客户信息
     */
    @Select("select * from sindata")
    ArrayList<SinData> getAllSinData();
    /**
     * 取出所有的VIP客户的电话号码集合
     *
     * @return ArrayList<Integer> 电话号码
     */
    @Select("select mobile from sindata")
    ArrayList<String> getAllVIPMobile();
}
