package com.market.user.service.impl;

import com.market.user.mapper.UserGuestMapper;
import com.market.user.model.UserGuest;
import com.market.user.service.IUserGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserGuestService
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@Service
public class UserGuestService implements IUserGuestService {
    @Autowired
    private UserGuestMapper userGuestMapper;

    @Override
    public UserGuest selectByPrimaryKey(Integer guestid) {
        return userGuestMapper.selectByPrimaryKey(guestid);
    }
}
