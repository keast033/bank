package com.example.demo.cust.pojo.cust;


/**
 * SinData class
 * 单个人脸识别记录
 * @author QianJunCheng
 * @date 2020/1/13
 */
public class SinData {
    private Integer id;
    /**
     * type
     * 识别者身份类型 1：员工 2：访客 3：陌生人
     */
    private Integer type;
    private Integer userId;
    private String signTime;
    private String mobile;

    public SinData() {
    }

    @Override
    public String toString() {
        return "SinData{" +
                "id=" + id +
                ", type=" + type +
                ", userId=" + userId +
                ", signTime='" + signTime + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public SinData(Integer id, Integer type, Integer userId, String signTime, String mobile) {

        this.id = id;
        this.type = type;
        this.userId = userId;
        this.signTime = signTime;
        this.mobile = mobile;
    }
}
