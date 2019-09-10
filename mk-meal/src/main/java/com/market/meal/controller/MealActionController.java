package com.market.meal.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MealActionController
 * @Description: 分布式三部曲：1.读取缓存2.修改缓存3.发消息至消息队列4.同步数据库
 * @Author zhengweilin
 * @Date 2019/9/10
 * @Version V1.0
 **/
@Api(tags ="套餐操作")
@RestController
@RequestMapping("mealaction")
public class MealActionController {
}
