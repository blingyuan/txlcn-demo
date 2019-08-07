package com.example.txlcn.business.controller;

import com.example.txlcn.business.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 17:07
 **/
@RequestMapping("/business")
@RestController
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/purchase")
    public void purchase(String userId, String commodityCode,Integer count){
        businessService.purchase(userId, commodityCode, count);
    }
}
