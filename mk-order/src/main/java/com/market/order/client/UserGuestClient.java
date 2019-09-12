package com.market.order.client;

import com.market.order.client.fallback.UserGuestFallBack;
import com.market.order.model.UserGuest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserGuestFallBack.class)
public interface UserGuestClient {
    @RequestMapping(value = "/userguest/getuserguestbyguestid", method= RequestMethod.GET)
    UserGuest selectByPrimaryKey(@RequestParam Integer guestid);
}
