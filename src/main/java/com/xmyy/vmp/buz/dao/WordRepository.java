package com.xmyy.vmp.buz.dao;

import com.xmyy.vmp.buz.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liuyi@stjf.com
 * @Date 12/13/2017 5:54 PM
 * @Vendor XMYY Information Technology Co.,Ltd.
 **/

public interface WordRepository extends JpaRepository<Word, Integer> {
    List<Word> findById(int id);

    @Override

    List<Word> findAll();

}
