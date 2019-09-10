package com.market.meal.model;

import java.math.BigDecimal;
import java.util.Date;

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

    private Integer watchers;

    private BigDecimal totalprice;

    private BigDecimal tempprice;

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

    public Integer getSetmealid() {
        return setmealid;
    }

    public void setSetmealid(Integer setmealid) {
        this.setmealid = setmealid;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public String getSetmealtype() {
        return setmealtype;
    }

    public void setSetmealtype(String setmealtype) {
        this.setmealtype = setmealtype == null ? null : setmealtype.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Boolean getIsorder() {
        return isorder;
    }

    public void setIsorder(Boolean isorder) {
        this.isorder = isorder;
    }

    public Boolean getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(Boolean isrefund) {
        this.isrefund = isrefund;
    }

    public Boolean getIsinhouse() {
        return isinhouse;
    }

    public void setIsinhouse(Boolean isinhouse) {
        this.isinhouse = isinhouse;
    }

    public Boolean getIsnew() {
        return isnew;
    }

    public void setIsnew(Boolean isnew) {
        this.isnew = isnew;
    }

    public Boolean getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Boolean isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Integer getValiddays() {
        return validdays;
    }

    public void setValiddays(Integer validdays) {
        this.validdays = validdays;
    }

    public Integer getBargainers() {
        return bargainers;
    }

    public void setBargainers(Integer bargainers) {
        this.bargainers = bargainers;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public BigDecimal getTempprice() {
        return tempprice;
    }

    public void setTempprice(BigDecimal tempprice) {
        this.tempprice = tempprice;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getValidtime() {
        return validtime;
    }

    public void setValidtime(Date validtime) {
        this.validtime = validtime;
    }

    public Date getExittime() {
        return exittime;
    }

    public void setExittime(Date exittime) {
        this.exittime = exittime;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links == null ? null : links.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
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