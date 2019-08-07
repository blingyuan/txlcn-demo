package com.example.txlcn.order.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 11:17
 **/
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_tbl")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private Integer count;

    @Column(nullable = false)
    private BigDecimal money;

    @Column(nullable = false)
    public String commodityCode;
}
