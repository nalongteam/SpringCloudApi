package com.market.meal.controller;

import com.market.meal.service.IMealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.text.DecimalFormat;

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
    @Autowired
    private IMealService mealService;

    @PostMapping("addwatchers")
    @ApiOperation(value="添加今日关注人数")
    public ResponseEntity<Boolean> AddWatchers(@RequestParam Integer setmealid){
          Boolean isOk=mealService.addWatchersBySetMealid(setmealid);
          return ResponseEntity.ok(isOk);
    }

    @PostMapping("bargains")
    @ApiOperation(value="砍价")
    public ResponseEntity<BigDecimal> Bargains(@RequestParam Integer setmealid){
        BigDecimal decimal= mealService.bargains(setmealid);
        return ResponseEntity.ok(decimal);
    }
}
