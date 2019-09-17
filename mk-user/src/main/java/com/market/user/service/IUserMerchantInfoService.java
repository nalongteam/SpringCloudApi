package com.market.user.service;

import com.market.user.model.UserMerchantInfo;

public interface IUserMerchantInfoService {
    UserMerchantInfo selectByPrimaryKey(Integer merchantid);
}
