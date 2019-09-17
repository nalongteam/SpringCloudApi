package com.market.user.controller;

import com.market.user.model.UserGuest;
import com.market.user.service.IUserGuestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @ClassName UserGuestController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@RestController
@RequestMapping("userguest")
@Api(tags = "用户")
public class UserGuestController {
    @Autowired
    private IUserGuestService userGuestService;

    @GetMapping("getuserguestbyguestid")
    @ApiOperation(value="根据用户id获取用户信息")
    public ResponseEntity<UserGuest> getUserGuestByGuestid(@RequestParam Integer guestid){
        UserGuest userGuest=userGuestService.selectByPrimaryKey(guestid);
        return ResponseEntity.ok(userGuest);
    }

    @GetMapping("getuserguestbyname")
    @ApiOperation(value="根据用户name获取用户信息")
    public ResponseEntity<UserGuest> getUserGuestByName(@RequestParam String name){
        UserGuest userGuest=userGuestService.selectByName(name);
        return ResponseEntity.ok(userGuest);
    }

    @GetMapping("selectuserbynameandpassword")
    @ApiOperation(value="根据用户name获取用户信息")
    public ResponseEntity<UserGuest> selectUserByNameAndPassword(@RequestParam String name,@RequestParam String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserGuest userGuest=userGuestService.selectUserByNameAndPassword(name,password);
        return ResponseEntity.ok(userGuest);
    }

    @PostMapping("adduser")
    @ApiOperation(value="新增用户")
    public ResponseEntity<Boolean> addUser(@RequestBody UserGuest userGuest) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Boolean isOk=userGuestService.insertSelective(userGuest);
        return ResponseEntity.ok(isOk);
    }
    @PostMapping("validuser")
    @ApiOperation(value="验证用户名和密码")
    public ResponseEntity<Boolean> ValidUser(@RequestParam String name,@RequestParam String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Boolean isOk=userGuestService.validUser(name,password);
        return ResponseEntity.ok(isOk);
    }

}
