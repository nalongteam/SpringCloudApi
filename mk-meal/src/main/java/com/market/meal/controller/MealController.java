package com.market.meal.controller;

import com.market.common.PageResult;
import com.market.meal.model.Meal;
import com.market.meal.service.IMealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MealController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/9
 * @Version V1.0
 **/
@Api(tags ="套餐")
@RestController
@RequestMapping("meal")
public class MealController {
    @Autowired
    private IMealService mealService;

    @GetMapping("page")
    @ApiOperation(value="分页获取套餐")
    public ResponseEntity<PageResult<Meal>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows) {
        PageResult<Meal> result = this.mealService.selectByPage(page,rows);

        if (result == null || result.getItems().size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(result);
    }
}
