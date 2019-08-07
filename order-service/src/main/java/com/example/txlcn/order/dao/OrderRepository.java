package com.example.txlcn.order.dao;

import com.example.txlcn.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 10:11
 **/
public interface OrderRepository extends JpaRepository<Order,Long> {
}
