package com.example.demo.cust.dao;

import com.example.demo.cust.pojo.Cust;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
/**
 * CustMapper interface
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
@Mapper
@Repository
public interface CustMapper {
    /**
     * 根据身份证号码查询对应的客户业务办理状态
     *
     * @param idNo 身份证号码
     * @return Cust 客户信息
     */
    Cust getCustByIdNo(String idNo);
//    @Select("select * from cust where userId = #{userId}")
//    Cust getCustByUserId(Integer userId);
}
