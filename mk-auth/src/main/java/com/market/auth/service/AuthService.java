package com.market.auth.service;

import com.market.auth.client.UserGuestClient;
import com.market.auth.config.JwtProperties;
import com.market.auth.enity.UserGuest;
import com.market.entity.UserInfo;
import com.market.auth.until.JwtUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName AuthService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/12
 * @Version V1.0
 **/
@Service
@EnableConfigurationProperties(JwtProperties.class)
public class AuthService {
    @Resource
    private UserGuestClient userGuestClient;

    @Resource
    private JwtProperties jwtProperties;

    public String getToken(String username, String password) throws Exception {
       UserGuest userGuest=this.userGuestClient.selectUserByNameAndPassword(username,password);
       if (userGuest!=null){
           UserInfo userInfo=new UserInfo();
           userInfo.setId(Long.valueOf(userGuest.getGuestid()));
           userInfo.setUsername(userGuest.getName());

           String token = JwtUtils.generateToken(userInfo, jwtProperties.getPrivateKey(), jwtProperties.getExpire());
           return token;
       }

       return null;
    }
}
