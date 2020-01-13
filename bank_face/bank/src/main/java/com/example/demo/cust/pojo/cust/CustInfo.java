package com.example.demo.cust.pojo.cust;

/**
 * CustInfo class
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
public class CustInfo {
    private String code;
    private String message;
    private PageData data;
    @Override
    public String toString() {
        return "CustInfo{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PageData getData() {
        return data;
    }

    public void setData(PageData data) {
        this.data = data;
    }

    public CustInfo(String code, String message, PageData data) {

        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CustInfo() {

    }
}
