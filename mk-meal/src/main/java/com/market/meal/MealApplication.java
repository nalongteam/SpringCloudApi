package com.market.meal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName MealApplication
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/6
 * @Version V1.0
 **/
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.market.meal.mapper")
public class MealApplication {
    public static void main(String[] args) {
        SpringApplication.run(MealApplication.class,args);
    }
}
