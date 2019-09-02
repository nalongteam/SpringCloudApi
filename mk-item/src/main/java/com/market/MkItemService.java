package com.market;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName MkItemService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/8/30
 * @Version V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement
@MapperScan("com.market.item.mapper")
public class MkItemService {
    public static void main(String[] args) {
        SpringApplication.run(MkItemService.class,args);
    }
}
