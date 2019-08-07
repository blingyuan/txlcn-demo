package com.example.txlcn.account.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.txlcn.account.dao.AccountRepository;
import com.example.txlcn.account.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 10:17
 **/
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void initAccount() {
        Account account = new Account("U100001", new BigDecimal(999));
        accountRepository.save(account);
    }

    @LcnTransaction
    @Transactional
    public List<Account> getAccountList() {
        return accountRepository.findAll();
    }

    /**
     * 余额扣款
     *
     * @param userId 用户ID
     * @param money  扣款金额
     */
    @LcnTransaction
    @Transactional
    public void debit(String userId, BigDecimal money){
        accountRepository.updateMoneyByUserId(money,userId);
        throw new NullPointerException("sss");
    }
}
