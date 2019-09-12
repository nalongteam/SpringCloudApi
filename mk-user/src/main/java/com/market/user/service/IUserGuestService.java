package com.market.user.service;

import com.market.user.model.UserGuest;

public interface IUserGuestService {
    UserGuest selectByPrimaryKey(Integer guestid);
}
