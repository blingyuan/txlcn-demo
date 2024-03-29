package com.example.txlcn.business.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "storage-service",path = "/storage")
public interface StorageClient {

    @GetMapping("/deduct")
    void deduct(@RequestParam String commodityCode,@RequestParam Integer count);
}
