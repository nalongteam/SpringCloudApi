package com.market.meal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.market.common.PageResult;
import com.market.meal.mapper.MealMapper;
import com.market.meal.model.Meal;
import com.market.meal.service.IMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MealService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/9
 * @Version V1.0
 **/
@Service
public class MealService implements IMealService {
    @Autowired
    private MealMapper mealMapper;
    @Override
    public PageResult<Meal> selectByPage(Integer pageNum, Integer pageSize) {
        PageResult<Meal> data=new PageResult<Meal>();
        // 开始分页
        Page page= PageHelper.startPage(pageNum, pageSize,true);

        List<Meal> meals=mealMapper.selectByPage();

        data.setTotal(page.getTotal());
        data.setTotalPage(Long.valueOf(page.getPages()));
        data.setItems(meals);

        return data;
    }
}
