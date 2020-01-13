package com.example.demo.cust.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.format.annotation.DateTimeFormat;
import sun.security.provider.MD5;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.example.demo.cust.util.MD5Utils.getMD5;
import static com.example.demo.cust.util.MD5Utils.getMD5Str;
/**
 * MD class
 *
 * @author XuYiPeng
 * @date 2020/1/13
 */
public class MD {

    public static String[] signMD5(){
        //人脸识别机器明文
        String appSecret="5780e249d2aeb0f19467822b975941ca";
        String timestamp = String.valueOf((new Date()).getTime());
        StringBuilder stringBuilder = new StringBuilder(timestamp.toString()).append("#").append(appSecret);
        String[] sign = new String[2];
        //时间戳
        sign[0]=timestamp;
        //根据时间戳对明文MD5加密计算出的密文
        sign[1]=DigestUtils.md5Hex(stringBuilder.toString());
        return sign;
    }

    public static void main(String[] args) {
        String[] sign = signMD5();
        System.out.println(sign[1]+"/n"+sign[0]);
    }





}
