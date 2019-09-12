package com.market.meal.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.market.common.PageResult;
import com.market.meal.mapper.MealMapper;
import com.market.meal.model.Meal;
import com.market.meal.service.IMealService;
import com.market.utils.reduce.StatelessReduceRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
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
    @Resource
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

    @Override
    public Boolean addWatchersBySetMealid(Integer setmealid) {
        Meal meal=mealMapper.selectByPrimaryKey(setmealid);
        if (meal!=null){
            meal.setWatchers(meal.getWatchers()+1);
            mealMapper.updateByPrimaryKey(meal);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public BigDecimal bargains(Integer setmealid) {
        Meal meal=mealMapper.selectByPrimaryKey(setmealid);
        if(meal!=null) {
            StatelessReduceRule statelessReduceRule = new StatelessReduceRule();
            BigDecimal bargins = statelessReduceRule.getReduce(meal.getTotalprice().subtract(meal.getMinprice()),meal.getTempprice().subtract(meal.getMinprice()),meal.getTotalbargainers(),meal.getTotalbargainers()-meal.getBargainers(),2);
            meal.setBargainers(meal.getBargainers()+1);
            meal.setTempprice(meal.getTempprice().subtract(bargins));
            mealMapper.updateByPrimaryKey(meal);
            return bargins;
        }
        else{
            return new BigDecimal(0);
        }
    }
}
