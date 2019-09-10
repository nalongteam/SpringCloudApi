package com.market.meal.service.impl;


import com.market.meal.mapper.MealDetailMapper;
import com.market.meal.mapper.MealMapper;

import com.market.meal.model.MealDetail;
import com.market.meal.service.IMealDetailService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MealDetailService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/9
 * @Version V1.0
 **/
@Service
public class MealDetailService implements IMealDetailService {
    @Resource
    private MealDetailMapper mealDetailMapper;
    @Override
    public List<MealDetail> selectBySetmealid(Integer setmealid) {
        return mealDetailMapper.selectBySetmealid(setmealid);
    }
}
