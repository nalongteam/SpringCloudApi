package com.market.order.service.impl;

import com.market.order.client.UserGuestClient;
import com.market.order.dto.response.OrderCommentResponse;
import com.market.order.mapper.OrderCommentMapper;
import com.market.order.model.OrderComment;
import com.market.order.model.UserGuest;
import com.market.order.service.IOrderCommentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName OrderCommentService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@Service
public class OrderCommentService implements IOrderCommentService {
    @Autowired
    private UserGuestClient userGuestClient;
    @Autowired
    private OrderCommentMapper orderCommentMapper;

    @Override
    public List<OrderCommentResponse> selectByMealid(Integer mealid) {
        List<OrderCommentResponse> dataList=new ArrayList<OrderCommentResponse>();
        List<OrderComment> orderCommentList = orderCommentMapper.selectByMealid(mealid);
        for (OrderComment orderComment:orderCommentList) {
            OrderCommentResponse response=new OrderCommentResponse();
            response.setStar(orderComment.getStar());
            response.setInfo(orderComment.getInfo());
            if(StringUtils.isNotBlank(orderComment.getImages())){
                response.setImages(Arrays.asList(orderComment.getImages().split(",")));
            }

            //获取用户信息
            UserGuest userGuest = userGuestClient.selectByPrimaryKey(orderComment.getGuestid());
            response.setUserNickName(userGuest.getNickname());
            response.setUserPhoto(userGuest.getPhoto());
            response.setCommentDate(userGuest.getAddtime());
            dataList.add(response);
        }

        return dataList;
    }
}
