package com.market.user.controller;

import com.market.user.model.UserGuest;
import com.market.user.service.IUserGuestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserGuestController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@RestController
@RequestMapping("userguest")
@Api("用户-买家")
public class UserGuestController {
    @Autowired
    private IUserGuestService userGuestService;

    @GetMapping("getuserguestbyguestid")
    @ApiOperation(value="根据用户id获取用户信息")
    public ResponseEntity<UserGuest> getUserGuestByGuestid(@RequestParam Integer guestid){
        UserGuest userGuest=userGuestService.selectByPrimaryKey(guestid);
        return ResponseEntity.ok(userGuest);
    }
}
