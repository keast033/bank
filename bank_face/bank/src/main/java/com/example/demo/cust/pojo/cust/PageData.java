package com.example.demo.cust.pojo.cust;

import java.util.List;

/**
 * PageData class
 *
 * @author QianJunCheng
 * @date 2020/1/13
 */
public class PageData {
    private Integer total;
    private Integer pageNum;
    private Integer size;
    private Integer pageSize;
    private Integer totalPage;
    private List<SinData> data;

    @Override
    public String toString() {
        return "PageData{" +
                "total=" + total +
                ", pageNum=" + pageNum +
                ", size=" + size +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<SinData> getData() {
        return data;
    }

    public void setData(List<SinData> data) {
        this.data = data;
    }

    public PageData(Integer total, Integer pageNum, Integer size, Integer pageSize, Integer totalPage, List<SinData> data) {

        this.total = total;
        this.pageNum = pageNum;
        this.size = size;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.data = data;
    }

    public PageData() {

    }
}
