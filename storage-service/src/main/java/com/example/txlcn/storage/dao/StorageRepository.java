package com.example.txlcn.storage.dao;

import com.example.txlcn.storage.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yuan.bie
 * @description TODO
 * @date 2019/8/2 10:11
 **/
public interface StorageRepository extends JpaRepository<Storage,Long> {

    @Modifying
    @Transactional
    @Query(value = "update storage_tbl set count = count - ?2 where commodity_code = ?1",nativeQuery = true)
    void deduce(String commodityCode, Integer count);

}
