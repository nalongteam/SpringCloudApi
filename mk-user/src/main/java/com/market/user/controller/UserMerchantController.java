package com.market.user.controller;

import com.market.user.model.UserGuest;
import com.market.user.model.UserMerchant;
import com.market.user.service.IUserMerchantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserMerchantController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@RestController
@RequestMapping("usermerchant")
@Api("用户-卖家")
public class UserMerchantController {
    @Autowired
    private IUserMerchantService userMerchantService;

    @GetMapping("getusermerchantbymerchantid")
    @ApiOperation(value="根据商户id获取商户信息")
    public ResponseEntity<UserMerchant> getUserMerchantByGuestid(@RequestParam Integer merchantid){
        UserMerchant userMerchant=userMerchantService.selectByPrimaryKey(merchantid);
        return ResponseEntity.ok(userMerchant);
    }
}
