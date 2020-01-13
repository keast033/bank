package com.example.demo.cust.pojo;
/**
 * Result class
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
public class Result{
    private String message;
    private final static String SUCCESS = "100";
    private final static String FAILD ="101";
    private Cust data;

    public Result success(Cust data) {
        this.data=data;
        this.message=SUCCESS;
        return this;
    }
    public Result faild(){
        this.message=FAILD;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", object=" + data +
                '}';
    }
}
