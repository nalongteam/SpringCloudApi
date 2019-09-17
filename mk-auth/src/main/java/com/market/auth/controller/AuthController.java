package com.market.auth.controller;

import com.market.auth.config.JwtProperties;
import com.market.entity.UserInfo;
import com.market.auth.service.AuthService;
import com.market.auth.until.JwtUtils;
import com.market.utils.CookieUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName AuthController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/16
 * @Version V1.0
 **/
@RestController
@RequestMapping("auth")
@Api(tags = "鉴权api")
@EnableConfigurationProperties(JwtProperties.class)
public class AuthController {
    @Resource
    private AuthService authService;

    @Resource
    private JwtProperties jwtProperties;

    @GetMapping("authorization")
    @ApiOperation(value="Cookie设置token")
    public ResponseEntity<Void> authorization(@RequestParam String username, @RequestParam String password, HttpServletRequest request, HttpServletResponse response){
        String token = null;
        try {
            token = this.authService.getToken(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (StringUtils.isBlank(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        //将令牌放到cookie中,httponly设置为true，防止js修改
        CookieUtils.setCookie(request,response,jwtProperties.getCookieName(),token,jwtProperties.getCookieMaxAge(),null,true);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("verify")
    @ApiOperation(value = "用户操作，需要刷新token")
    public ResponseEntity<UserInfo> getUserInfo(
            @CookieValue("MK_TOKEN") String token,
            HttpServletRequest request,
            HttpServletResponse response
    ){
        try {
            UserInfo userInfo = JwtUtils.getInfoFromToken(token, jwtProperties.getPublicKey());
            //只要用户有这个请求，就给用户一个新的token，防止过期
            String newToken = JwtUtils.generateToken(userInfo, jwtProperties.getPrivateKey(), jwtProperties.getExpire());
            //这里的true谁不允许js操作的意思
            CookieUtils.setCookie(request,response,jwtProperties.getCookieName(),
                    newToken,jwtProperties.getCookieMaxAge(),null,true);
            return ResponseEntity.status(HttpStatus.OK).body(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

}
