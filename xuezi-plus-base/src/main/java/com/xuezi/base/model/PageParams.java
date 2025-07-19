package com.xuezi.base.model;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PageParams {
    //当前页码
    private Long pageNo = 1L;

    //每页大小
    private Long pageSize = 10L;

    public PageParams(){};

    public PageParams(Long pageNo, Long pageSize){
        this.pageNo= pageNo;
        this.pageSize =pageSize;
    };

}
