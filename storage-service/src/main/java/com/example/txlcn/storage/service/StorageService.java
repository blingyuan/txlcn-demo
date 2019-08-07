package com.example.txlcn.storage.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.txlcn.storage.dao.StorageRepository;
import com.example.txlcn.storage.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 13:34
 **/
@Service
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    public void initStorage() {
        Storage storage = new Storage(100,"C00321");
        storageRepository.save(storage);
    }

    @LcnTransaction
    @Transactional
    public void deduct(String commodityCode, int count) {
        storageRepository.deduce(commodityCode,count);
    }
}
