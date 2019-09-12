package com.market.user.mapper;

import com.market.user.model.UserMerchant;

public interface UserMerchantMapper {
    int deleteByPrimaryKey(Integer merchantid);

    int insert(UserMerchant record);

    int insertSelective(UserMerchant record);

    UserMerchant selectByPrimaryKey(Integer merchantid);

    int updateByPrimaryKeySelective(UserMerchant record);

    int updateByPrimaryKey(UserMerchant record);
}