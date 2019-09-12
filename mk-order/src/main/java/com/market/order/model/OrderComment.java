package com.market.order.model;

import java.util.Date;

public class OrderComment {
    private Integer id;

    private Integer orderid;

    private Integer guestid;

    private String mealid;

    private Integer star;

    private String info;

    private String images;

    private Boolean status;

    private Integer adder;

    private Date addtime;

    private Integer moder;

    private Date modtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getGuestid() {
        return guestid;
    }

    public void setGuestid(Integer guestid) {
        this.guestid = guestid;
    }

    public String getMealid() {
        return mealid;
    }

    public void setMealid(String mealid) {
        this.mealid = mealid == null ? null : mealid.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
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