package com.market.order.dto.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.market.utils.CustomDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @ClassName OrderCommentResponse
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
public class OrderCommentResponse {
    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
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
        this.info = info;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    private String userNickName;
    private String userPhoto;
    private Integer star;
    private String info;
    private List<String> images;
    private Date commentDate;
}
