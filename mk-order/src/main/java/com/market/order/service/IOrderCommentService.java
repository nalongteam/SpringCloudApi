package com.market.order.service;

import com.market.order.dto.response.OrderCommentResponse;
import java.util.List;

public interface IOrderCommentService {
    List<OrderCommentResponse> selectByMealid(Integer mealid);
}
