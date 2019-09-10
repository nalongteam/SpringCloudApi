package com.market.meal.service;

import com.market.common.PageResult;
import com.market.meal.model.Meal;

public interface IMealService {
    PageResult<Meal>  selectByPage(Integer pageNum, Integer pageSize);
}
