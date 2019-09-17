package com.market.user.service;

import com.market.user.model.UserGuest;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface IUserGuestService {
    UserGuest selectByPrimaryKey(Integer guestid);
    UserGuest selectByName(String name);
    Boolean insertSelective(UserGuest record) throws UnsupportedEncodingException, NoSuchAlgorithmException;
    Boolean validUser(String name,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;
    UserGuest selectUserByNameAndPassword(String name,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
