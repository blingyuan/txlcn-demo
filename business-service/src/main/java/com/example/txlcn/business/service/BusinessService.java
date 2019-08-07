package com.example.txlcn.business.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.example.txlcn.business.feign.OrderClient;
import com.example.txlcn.business.feign.StorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 17:08
 **/
@Service
public class BusinessService {

    @Autowired
    private StorageClient storageService;

    @Autowired
    private OrderClient orderService;

    @LcnTransaction
    @Transactional
    public void purchase(String userId, String commodityCode,Integer count) {
        storageService.deduct(commodityCode,count);
        orderService.create(userId, commodityCode, count);
//        throw new NullPointerException("test 抛出空指针异常！");
    }
}
