package com.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName MkRegistry
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/8/28
 * @Version V1.0
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class MkRegistry {
    public static void main(String[] args) {
        SpringApplication.run(MkRegistry.class,args);
    }
}
