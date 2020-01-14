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
     * 根据手机号码查询对应的客户业务办理状态
     *
     * @param mobile 手机号码
     * @return Cust 客户信息
     */
    @Select("select * from cust where mobile = #{mobile}")
    Cust getCustByMobile(String mobile);
    /**
     * 根据身份证号码查询对应的客户业务办理状态
     *
     * @param Idno 身份证号码
     * @return Cust 客户信息
     */
    @Select("select * from cust where idno = #{Idno}")
    Cust getCustByIdno(String Idno);
//    @Select("select * from cust where userId = #{userId}")
//    Cust getCustByUserId(Integer userId);
}
