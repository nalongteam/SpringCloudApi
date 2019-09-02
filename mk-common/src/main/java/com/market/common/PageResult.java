package com.market.common;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PageResult
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Data
public class PageResult<T> {
    private Long total;// 总条数

    private Long totalPage;// 总页数

    private List<T> items;// 当前页数据
}
