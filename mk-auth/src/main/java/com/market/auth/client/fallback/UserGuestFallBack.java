package com.market.auth.client.fallback;

import com.market.auth.client.UserGuestClient;
import com.market.auth.enity.UserGuest;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserGuestFallBack
 * @Description: UserGuest服务降级
 * @Author zhengweilin
 * @Date 2019/9/11
 * @Version V1.0
 **/
@Component
public class UserGuestFallBack implements UserGuestClient {
    @Override
    public UserGuest selectByPrimaryKey(Integer guestid) {
        return null;
    }
}
