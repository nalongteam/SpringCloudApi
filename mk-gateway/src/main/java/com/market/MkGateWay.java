package com.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName MkGateWay
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/8/28
 * @Version V1.0
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableZuulProxy
public class MkGateWay {
    public static void main(String[] args) {
        SpringApplication.run(MkGateWay.class,args);
    }
}
