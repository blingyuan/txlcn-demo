package com.example.txlcn.account.controller;

import com.example.txlcn.account.entity.Account;
import com.example.txlcn.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/1 17:11
 **/
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/initAccount")
    public void initAccount(){
        accountService.initAccount();
    }

    @GetMapping("/debit")
    public void debit(String userId, BigDecimal money){
        accountService.debit(userId,money);
    }

    @GetMapping("/getAccountList")
    public List<Account> getAccountList(){
        return accountService.getAccountList();
    }
}
