package com.example.txlcn.storage.controller;

import com.example.txlcn.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 16:41
 **/
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/initStorage")
    public void initStorage(){
        storageService.initStorage();
    }

    /**
     * 扣减库存
     * @param commodityCode
     * @param count
     */
    @GetMapping("/deduct")
    public void deduct(@RequestParam String commodityCode,@RequestParam Integer count){
        storageService.deduct(commodityCode,count);
    }
}
