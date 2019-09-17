package com.market.auth.client;

import com.market.auth.client.fallback.UserGuestFallBack;
import com.market.auth.enity.UserGuest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserGuestFallBack.class)
public interface UserGuestClient {
    @RequestMapping(value = "/userguest/selectuserbynameandpassword", method= RequestMethod.GET)
    UserGuest selectUserByNameAndPassword(@RequestParam String name,@RequestParam String password);
}
