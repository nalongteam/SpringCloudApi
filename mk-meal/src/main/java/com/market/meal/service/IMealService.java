package com.market.meal.service;

import com.market.common.PageResult;
import com.market.meal.model.Meal;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public interface IMealService {
    PageResult<Meal>  selectByPage(Integer pageNum, Integer pageSize);
    Boolean addWatchersBySetMealid(Integer setmealid);
    BigDecimal bargains(Integer setmealid);
}
