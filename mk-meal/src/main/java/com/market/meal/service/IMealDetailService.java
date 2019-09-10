package com.market.meal.service;

import com.market.meal.model.MealDetail;

import java.util.List;

public interface IMealDetailService {
    List<MealDetail> selectBySetmealid(Integer setmealid);
}
