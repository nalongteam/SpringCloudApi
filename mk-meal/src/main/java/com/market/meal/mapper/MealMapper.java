package com.market.meal.mapper;

import com.market.meal.model.Meal;

import java.util.List;

public interface MealMapper {
    int deleteByPrimaryKey(Integer setmealid);

    int insert(Meal record);

    int insertSelective(Meal record);

    Meal selectByPrimaryKey(Integer setmealid);

    int updateByPrimaryKeySelective(Meal record);

    int updateByPrimaryKey(Meal record);

    List<Meal> selectByPage();
}