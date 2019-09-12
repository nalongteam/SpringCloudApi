package com.market.user.service;

import com.market.user.model.UserMerchant;

public interface IUserMerchantService {
    UserMerchant selectByPrimaryKey(Integer merchantid);
}
