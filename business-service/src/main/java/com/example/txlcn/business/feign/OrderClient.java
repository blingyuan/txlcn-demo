package com.example.txlcn.business.feign;

import com.example.txlcn.business.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-service",path = "/order")
public interface OrderClient {

    @GetMapping("/create")
    Order create(@RequestParam String userId,@RequestParam String commodityCode,@RequestParam int orderCount);
}
