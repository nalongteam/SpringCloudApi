package com.market.user.service.impl;

import com.market.user.mapper.UserMerchantInfoMapper;
import com.market.user.model.UserMerchantInfo;
import com.market.user.service.IUserMerchantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserMerchantInfoService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@Service
public class UserMerchantInfoService implements IUserMerchantInfoService {
    @Autowired
    private UserMerchantInfoMapper userMerchantInfoMapper;

    @Override
    public UserMerchantInfo selectByPrimaryKey(Integer merchantid) {
        return userMerchantInfoMapper.selectByPrimaryKey(merchantid);
    }
}
