package com.market.user.service.impl;

import com.market.user.mapper.UserMerchantMapper;
import com.market.user.model.UserMerchant;
import com.market.user.service.IUserMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserMerchantService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@Service
public class UserMerchantService implements IUserMerchantService {
    @Autowired
    private UserMerchantMapper userMerchantMapper;

    @Override
    public UserMerchant selectByPrimaryKey(Integer merchantid) {
        return userMerchantMapper.selectByPrimaryKey(merchantid);
    }
}
