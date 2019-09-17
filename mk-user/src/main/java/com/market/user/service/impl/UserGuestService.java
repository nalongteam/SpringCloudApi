package com.market.user.service.impl;

import com.market.user.mapper.UserGuestMapper;
import com.market.user.model.UserGuest;
import com.market.user.service.IUserGuestService;
import com.market.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

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

    @Override
    public UserGuest selectByName(String name) {
        return userGuestMapper.selectByName(name);
    }

    @Override
    public Boolean insertSelective(UserGuest record) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        record.setPassword(Md5Utils.getEncryptedPwd(record.getPassword()));
        return userGuestMapper.insertSelective(record)>0;
    }

    @Override
    public Boolean validUser(String name,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserGuest userGuest = userGuestMapper.selectByName(name);
        if(name!=null){
            return Md5Utils.validPassword(password,userGuest.getPassword());
        }

        return false;
    }

    @Override
    public UserGuest selectUserByNameAndPassword(String name, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserGuest userGuest = userGuestMapper.selectByName(name);
        if (Md5Utils.validPassword(password,userGuest.getPassword())){
            return userGuest;
        }

        return  null;
    }
}
