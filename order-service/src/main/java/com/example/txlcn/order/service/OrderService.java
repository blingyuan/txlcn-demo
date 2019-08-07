package com.example.txlcn.order.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.txlcn.order.dao.OrderRepository;
import com.example.txlcn.order.entity.Order;
import com.example.txlcn.order.feign.AccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 13:34
 **/
@Service
public class OrderService {

    @Autowired
    private AccountClient accountService;

    @Autowired
    private OrderRepository orderRepository;

    @LcnTransaction
    @Transactional
    public Order create(String userId, String commodityCode, int orderCount){
        // 计算订单金额
        BigDecimal orderMoney = calculate(commodityCode, orderCount);
        // 从账户余额扣款
        accountService.debit(userId, orderMoney);
        Order order = new Order();
        order.setUserId(userId);
        order.setCount(orderCount);
        order.setMoney(orderMoney);
        order.setCommodityCode(commodityCode);
        orderRepository.save(order);
        return order;
    }

    private BigDecimal calculate(String commodityId, int orderCount) {
        return new BigDecimal(200 * orderCount);
    }

}
