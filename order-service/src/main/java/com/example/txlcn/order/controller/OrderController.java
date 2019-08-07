package com.example.txlcn.order.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.txlcn.order.entity.Account;
import com.example.txlcn.order.entity.Order;
import com.example.txlcn.order.feign.AccountClient;
import com.example.txlcn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 14:58
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private AccountClient accountClient;

    @Autowired
    private OrderService orderService;

    @GetMapping("/getAccountList")
    @Transactional
    @LcnTransaction
    public List<Account> getAccountList(){
        return accountClient.getAccountList();
    }

    @GetMapping("/create")
    public Order create(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam Integer orderCount){
        return orderService.create(userId, commodityCode, orderCount);
    }
}
