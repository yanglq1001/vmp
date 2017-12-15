package com.xmyy.vmp.buz.controller;

import com.google.gson.Gson;
import com.xmyy.vmp.buz.dao.WordRepository;
import com.xmyy.vmp.buz.dao.WordsRepository;
import com.xmyy.vmp.buz.domain.Words;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyi@stjf.com
 * @Date 12/14/2017 3:59 PM
 * @Vendor XMYY Information Technology Co.,Ltd.
 **/
@RestController
@RequestMapping("/buz/words")
public class WordsController {
    @Autowired
    WordsRepository wordsRepository;

    @RequestMapping("/all")
    public String getAllWords() {
        List<Words> wordsList = wordsRepository.findAll();
        System.out.println(wordsList.get(0).getWordList().size());
        System.out.println(wordsList.get(1).getWordList().size());
        System.out.println(wordsList.get(2).getWordList().get(0).toString());
        System.out.println(wordsList.get(3).getWordList().size());

        /*Gson gson = new Gson();
        String s = gson.toJson(wordsList);*/
        return "";
    }


}
