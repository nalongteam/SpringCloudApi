package com.market.order.controller;

import com.market.order.client.UserGuestClient;
import com.market.order.dto.response.OrderCommentResponse;
import com.market.order.model.UserGuest;
import com.market.order.service.IOrderCommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName OrderCommentController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@Api(tags ="订单评论操作")
@RestController
@RequestMapping("ordercomment")
public class OrderCommentController {
    @Autowired
    private IOrderCommentService orderCommentService;

    @GetMapping("getcommentbysetmealid")
    @ApiOperation(value="根据套餐id获取套餐的所有评论")
    public ResponseEntity<List<OrderCommentResponse>> getUserGuestByGuestid(@RequestParam Integer mealdid){
        List<OrderCommentResponse> userGuest=orderCommentService.selectByMealid(mealdid);
        return ResponseEntity.ok(userGuest);
    }
}
