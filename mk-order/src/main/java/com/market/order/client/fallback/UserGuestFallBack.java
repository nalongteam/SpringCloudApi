package com.market.order.client.fallback;

import com.market.order.client.UserGuestClient;
import com.market.order.model.UserGuest;
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
