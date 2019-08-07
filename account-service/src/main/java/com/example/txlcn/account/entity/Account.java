package com.example.txlcn.account.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 10:06
 **/
@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "account_tbl")
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private BigDecimal money;

    public Account(String userId, BigDecimal money) {
        this.userId = userId;
        this.money = money;
    }
}
