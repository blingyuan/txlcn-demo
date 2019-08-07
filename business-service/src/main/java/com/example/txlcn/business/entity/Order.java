package com.example.txlcn.business.entity;

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
public class Order {

    private Long id;

    private String userId;

    private Integer count;

    private BigDecimal money;

    public String commodityCode;
}
