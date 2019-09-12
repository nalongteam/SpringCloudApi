package com.market.order.mapper;

import com.market.order.model.OrderComment;

import java.util.List;

public interface OrderCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderComment record);

    int insertSelective(OrderComment record);

    OrderComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderComment record);

    int updateByPrimaryKey(OrderComment record);

    List<OrderComment> selectByMealid(Integer mealid);
}