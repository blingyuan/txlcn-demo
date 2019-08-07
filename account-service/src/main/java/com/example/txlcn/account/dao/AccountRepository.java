package com.example.txlcn.account.dao;

import com.example.txlcn.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.math.BigDecimal;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 10:11
 **/
public interface AccountRepository extends JpaRepository<Account,Long> {
    @Modifying
    @Transactional
    @Query(value = "delete from account_tbl where user_id = ?1",nativeQuery = true)
    void deleteByUserId(String userId);

    @Modifying
    @Transactional
    @Query(value = "update account_tbl set money = money - ?1 where user_id = ?2",nativeQuery = true)
    void updateMoneyByUserId(BigDecimal money,String userId);
}
