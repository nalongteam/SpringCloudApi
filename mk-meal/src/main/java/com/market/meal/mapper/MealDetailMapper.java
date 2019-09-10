package com.market.meal.mapper;

import com.market.meal.model.MealDetail;

import java.util.List;

public interface MealDetailMapper {
    int deleteByPrimaryKey(Integer setmealdetailid);

    int insert(MealDetail record);

    int insertSelective(MealDetail record);

    MealDetail selectByPrimaryKey(Integer setmealdetailid);

    int updateByPrimaryKeySelective(MealDetail record);

    int updateByPrimaryKey(MealDetail record);

    List<MealDetail> selectBySetmealid(Integer setmealid);
}