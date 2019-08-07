package com.example.txlcn.storage;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 14:18
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableDistributedTransaction
public class StorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class,args);
    }
}
