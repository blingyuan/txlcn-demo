package com.example.txlcn.order.feign;

import com.example.txlcn.order.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 14:04
 **/
@FeignClient(value = "account-service",path = "/account")
public interface AccountClient {

    @GetMapping("/debit")
    void debit(@RequestParam String userId, @RequestParam BigDecimal money);

    @GetMapping("/getAccountList")
    List<Account> getAccountList();
}
