package com.market.user.model;

import java.util.Date;

public class UserGuest {
    private Integer guestid;

    private String name;

    private String photo;

    private String nickname;

    private String wechat;

    private String password;

    private String phone;

    private Integer golds;

    private Boolean status;

    private Integer adder;

    private Date addtime;

    private Integer moder;

    private Date modtime;

    public Integer getGuestid() {
        return guestid;
    }

    public void setGuestid(Integer guestid) {
        this.guestid = guestid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getGolds() {
        return golds;
    }

    public void setGolds(Integer golds) {
        this.golds = golds;
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