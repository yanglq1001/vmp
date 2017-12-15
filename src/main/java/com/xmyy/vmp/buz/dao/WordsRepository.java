package com.xmyy.vmp.buz.dao;

import com.xmyy.vmp.buz.domain.Words;
import org.junit.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liuyi@stjf.com
 * @Date 12/14/2017 4:01 PM
 * @Vendor XMYY Information Technology Co.,Ltd.
 **/

public interface WordsRepository extends JpaRepository<Words, Integer> {

    @Override
    public List<Words> findAll() ;

    @Override
    Words findOne(Integer integer);

}
