package com.market.meal.model;

import java.math.BigDecimal;
import java.util.Date;

public class MealDetail {
    private Integer setmealdetailid;

    private Integer setmealid;

    private String name;

    private Integer nums;

    private BigDecimal price;

    private String image;

    private BigDecimal totalprice;

    private Boolean status;

    private Integer adder;

    private Date addtime;

    private Integer moder;

    private Date modtime;

    public Integer getSetmealdetailid() {
        return setmealdetailid;
    }

    public void setSetmealdetailid(Integer setmealdetailid) {
        this.setmealdetailid = setmealdetailid;
    }

    public Integer getSetmealid() {
        return setmealid;
    }

    public void setSetmealid(Integer setmealid) {
        this.setmealid = setmealid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getAdder() {
        return adder;
    }

    public void setAdder(Integer adder) {
        this.adder = adder;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getModer() {
        return moder;
    }

    public void setModer(Integer moder) {
        this.moder = moder;
    }

    public Date getModtime() {
        return modtime;
    }

    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }
}