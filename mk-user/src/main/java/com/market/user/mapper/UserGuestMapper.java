package com.market.user.mapper;

import com.market.user.model.UserGuest;

public interface UserGuestMapper {
    int deleteByPrimaryKey(Integer guestid);

    int insert(UserGuest record);

    int insertSelective(UserGuest record);

    UserGuest selectByPrimaryKey(Integer guestid);

    int updateByPrimaryKeySelective(UserGuest record);

    int updateByPrimaryKey(UserGuest record);

    UserGuest selectByName(String name);
}