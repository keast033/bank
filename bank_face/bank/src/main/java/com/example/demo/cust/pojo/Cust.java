package com.example.demo.cust.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
/**
 * Cust class
 * 单个客户相关业务是否办理了（0：未办理，1：已办理，2：正在办理）
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
public class Cust {

    /**
     * date
     * 日期
     */
    private String date;

    /**
     * name
     * 姓名
     */
    private String name;

    /**
     * idno
     * 身份证号
     */
    private String idno;

    /**
     * YGEDState
     * 阳光E贷
     */
    private Integer YGEDState;

    /**
     * mobileBankState
     * 手机银行
     */
    private Integer mobileBankState;

    /**
     * provinceWXState
     * 省微信
     */
    private Integer provinceWXState;

    /**
     * AliPayState
     * 支付宝
     */
    private Integer AliPayState;

    /**
     * WXPayState
     * 微信支付
     */
    private Integer WXPayState;

    /**
     * baiDuPayState
     * 百度支付
     */
    private Integer baiDuPayState;

    /**
     * SYBState
     * 收银宝
     */
    private Integer SYBState;


    /**

     * JDPayState
     * 京东
     */
    private Integer JDPayState;

    /**
     * cloudFlashPayState
     * 云闪付
     */
    private Integer cloudFlashPayState;

    /**
     * unionPayState
     * 银联
     */
    private Integer unionPayState;

    /**
     * creditCardState
     * 贷记卡
     */
    private Integer creditCardState;

    /**
     * ETCState
     * ETC
     */
    private Integer ETCState;

    /**
     * SXKHState
     * 是否是授信客户
     */
    private Integer SXKHState;

    /**
     * DYKHState
     * 是否是电银客户
     */
    private Integer DYKHState;

    /**
     * count
     * 用户来访总次数
     */
    private Integer count;

    /**
     * userId
     * 识别系统唯一userID
     */
    private Integer userId;

    @Override
    public String toString() {
        return "Cust{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", idno='" + idno + '\'' +
                ", YGEDState=" + YGEDState +
                ", mobileBankState=" + mobileBankState +
                ", provinceWXState=" + provinceWXState +
                ", AliPayState=" + AliPayState +
                ", WXPayState=" + WXPayState +
                ", baiDuPayState=" + baiDuPayState +
                ", JDPayState=" + JDPayState +
                ", cloudFlashPayState=" + cloudFlashPayState +
                ", unionPayState=" + unionPayState +
                ", creditCardState=" + creditCardState +
                ", ETCState=" + ETCState +
                ", SXKHState=" + SXKHState +
                ", DYKHState=" + DYKHState +
                ", count=" + count +
                ", userId=" + userId +
                '}';
    }
    public Integer getSYBState() {
        return SYBState;
    }

    public Cust(String date, String name, String idno, Integer YGEDState, Integer mobileBankState, Integer provinceWXState, Integer aliPayState, Integer WXPayState, Integer baiDuPayState, Integer SYBState, Integer JDPayState, Integer cloudFlashPayState, Integer unionPayState, Integer creditCardState, Integer ETCState, Integer SXKHState, Integer DYKHState, Integer count, Integer userId) {
        this.date = date;
        this.name = name;
        this.idno = idno;
        this.YGEDState = YGEDState;
        this.mobileBankState = mobileBankState;
        this.provinceWXState = provinceWXState;
        AliPayState = aliPayState;
        this.WXPayState = WXPayState;
        this.baiDuPayState = baiDuPayState;
        this.SYBState = SYBState;
        this.JDPayState = JDPayState;
        this.cloudFlashPayState = cloudFlashPayState;
        this.unionPayState = unionPayState;
        this.creditCardState = creditCardState;
        this.ETCState = ETCState;
        this.SXKHState = SXKHState;
        this.DYKHState = DYKHState;
        this.count = count;
        this.userId = userId;
    }

    public void setSYBState(Integer SYBState) {
        this.SYBState = SYBState;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public Integer getYGEDState() {
        return YGEDState;
    }

    public void setYGEDState(Integer YGEDState) {
        this.YGEDState = YGEDState;
    }

    public Integer getMobileBankState() {
        return mobileBankState;
    }

    public void setMobileBankState(Integer mobileBankState) {
        this.mobileBankState = mobileBankState;
    }

    public Integer getProvinceWXState() {
        return provinceWXState;
    }

    public void setProvinceWXState(Integer provinceWXState) {
        this.provinceWXState = provinceWXState;
    }

    public Integer getAliPayState() {
        return AliPayState;
    }

    public void setAliPayState(Integer aliPayState) {
        AliPayState = aliPayState;
    }

    public Integer getWXPayState() {
        return WXPayState;
    }

    public void setWXPayState(Integer WXPayState) {
        this.WXPayState = WXPayState;
    }

    public Integer getBaiDuPayState() {
        return baiDuPayState;
    }

    public void setBaiDuPayState(Integer baiDuPayState) {
        this.baiDuPayState = baiDuPayState;
    }

    public Integer getJDPayState() {
        return JDPayState;
    }

    public void setJDPayState(Integer JDPayState) {
        this.JDPayState = JDPayState;
    }

    public Integer getCloudFlashPayState() {
        return cloudFlashPayState;
    }

    public void setCloudFlashPayState(Integer cloudFlashPayState) {
        this.cloudFlashPayState = cloudFlashPayState;
    }

    public Integer getUnionPayState() {
        return unionPayState;
    }

    public void setUnionPayState(Integer unionPayState) {
        this.unionPayState = unionPayState;
    }

    public Integer getCreditCardState() {
        return creditCardState;
    }

    public void setCreditCardState(Integer creditCardState) {
        this.creditCardState = creditCardState;
    }

    public Integer getETCState() {
        return ETCState;
    }

    public void setETCState(Integer ETCState) {
        this.ETCState = ETCState;
    }

    public Integer getSXKHState() {
        return SXKHState;
    }

    public void setSXKHState(Integer SXKHState) {
        this.SXKHState = SXKHState;
    }

    public Integer getDYKHState() {
        return DYKHState;
    }

    public void setDYKHState(Integer DYKHState) {
        this.DYKHState = DYKHState;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Cust(String date, String name, String idno, Integer YGEDState, Integer mobileBankState, Integer provinceWXState, Integer aliPayState, Integer WXPayState, Integer baiDuPayState, Integer JDPayState, Integer cloudFlashPayState, Integer unionPayState, Integer creditCardState, Integer ETCState, Integer SXKHState, Integer DYKHState, Integer count, Integer userId) {

        this.date = date;
        this.name = name;
        this.idno = idno;
        this.YGEDState = YGEDState;
        this.mobileBankState = mobileBankState;
        this.provinceWXState = provinceWXState;
        AliPayState = aliPayState;
        this.WXPayState = WXPayState;
        this.baiDuPayState = baiDuPayState;
        this.JDPayState = JDPayState;
        this.cloudFlashPayState = cloudFlashPayState;
        this.unionPayState = unionPayState;
        this.creditCardState = creditCardState;
        this.ETCState = ETCState;
        this.SXKHState = SXKHState;
        this.DYKHState = DYKHState;
        this.count = count;
        this.userId = userId;
    }

    public Cust() {

    }
}
