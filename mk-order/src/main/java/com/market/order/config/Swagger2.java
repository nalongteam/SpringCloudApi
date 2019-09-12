package com.market.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName Swagger2
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean("meal")
    public Docket controller1Apis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("订单api")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.market.order.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("薅羊毛后端api接口文档")
                .description("硬骨头男人")
                .version("1.0")
                .build();
    }
}
