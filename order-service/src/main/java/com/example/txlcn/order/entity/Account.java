package com.example.txlcn.order.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Account {

    private Long id;

    private String userId;

    private BigDecimal money;

    public Account(String userId, BigDecimal money) {
        this.userId = userId;
        this.money = money;
    }
}
