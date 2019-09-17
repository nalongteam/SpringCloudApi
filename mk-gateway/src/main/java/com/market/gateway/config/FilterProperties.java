package com.market.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @ClassName FilterProperties
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/16
 * @Version V1.0
 **/
@ConfigurationProperties(prefix = "mk.filter")
public class FilterProperties {
    private List<String> allowPaths;

    public List<String> getAllowPaths() {
        return allowPaths;
    }

    public void setAllowPaths(List<String> allowPaths) {
        this.allowPaths = allowPaths;
    }
}
