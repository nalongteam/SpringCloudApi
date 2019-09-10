package com.market.meal.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Meal {
    private Integer setmealid;

    private Integer merchantid;

    private String setmealtype;

    private String title;

    private Integer people;

    private Boolean isorder;

    private Boolean isrefund;

    private Boolean isinhouse;

    private Boolean isnew;

    private Boolean isrecommend;

    private Integer validdays;

    private Integer bargainers;

    private Integer totalbargainers;

    private Integer watchers;

    private BigDecimal totalprice;

    private BigDecimal tempprice;

    private BigDecimal minprice;

    private Date createtime;

    private Date validtime;

    private Date exittime;

    private String links;

    private String cover;

    private String info;

    private Boolean status;

    private Integer adder;

    private Date addtime;

    private Integer moder;

    private Date modtime;
}