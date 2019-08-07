package com.example.txlcn.storage.entity;

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
@Entity
@Table(name = "storage_tbl")
public class Storage {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer count;

    @Column(nullable = false)
    public String commodityCode;

    public Storage(Integer count, String commodityCode) {
        this.count = count;
        this.commodityCode = commodityCode;
    }
}
