package com.market.item.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyDruidConfig
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Configuration
public class MyDruidConfig {
    //将设置参数的druid的数据源注册到IOC容器中
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    //配置Druid监控
    //1.配置管理后台的Servlet
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //com.alibaba.druid.support.http.ResourceServlet
        Map<String,String> initParams = new HashMap<String, String>();
        initParams.put("loginUsername","admin");//登录后台时的用户名
        initParams.put("loginPassword","123456");//登录后台时的密码
        initParams.put("allow","");//默认就是允许所有的访问
        initParams.put("deny","");//拒绝
        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }

    //2.配置一个web监控的过滤器
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<String, String>();
        initParams.put("exclusions","*.js,*.css,/druid/*");//不拦截的请求
        filterRegistrationBean.setInitParameters(initParams);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }
}