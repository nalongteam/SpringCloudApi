package com.market.gateway.filter;

import com.market.gateway.config.FilterProperties;
import com.market.gateway.config.JwtProperties;
import com.market.utils.CookieUtils;
import com.market.utils.jwt.JwtUtils;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName LoginFilter
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/16
 * @Version V1.0
 **/
@Component
@EnableConfigurationProperties({JwtProperties.class, FilterProperties.class})
public class LoginFilter extends ZuulFilter {
    @Autowired
    private JwtProperties properties;

    @Autowired
    private FilterProperties filterProperties;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 5;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        String requestURI= request.getRequestURI();

        return !isAllowPath(requestURI);
    }

    private boolean isAllowPath(String requestURI){
        boolean flag=false;
        for (String path:this.filterProperties.getAllowPaths()){
            if(requestURI.startsWith(path)){
                flag=true;
                break;
            }
        }

        return flag;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();
        String token= CookieUtils.getCookieValue(request,this.properties.getCookieName());

        try {
            JwtUtils.getInfoFromToken(token,this.properties.getPublicKey());
        } catch (Exception e) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
        }

        return null;
    }
}
