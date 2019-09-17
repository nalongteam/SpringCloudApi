package com.market.user.mapper;

import com.market.user.model.UserMerchantInfo;

public interface UserMerchantInfoMapper {
    int deleteByPrimaryKey(Integer merchantid);

    int insert(UserMerchantInfo record);

    int insertSelective(UserMerchantInfo record);

    UserMerchantInfo selectByPrimaryKey(Integer merchantid);

    int updateByPrimaryKeySelective(UserMerchantInfo record);

    int updateByPrimaryKey(UserMerchantInfo record);
}