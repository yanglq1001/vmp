package com.xmyy.vmp.buz.controller;

import com.google.gson.Gson;
import com.xmyy.vmp.buz.dao.WordRepository;
import com.xmyy.vmp.buz.domain.Word;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuyi@stjf.com
 * @Date 12/12/2017 10:28 AM
 * @Vendor XMYY Information Technology Co.,Ltd.
 **/

@RestController
@RequestMapping("/buz/word")
public class WordController {
    @Autowired
    WordRepository wordRepository;

    @RequestMapping("/all")
    public String getWord() {
        List<Word> allWord = wordRepository.findAll();
        System.out.println(allWord.get(0).toString());

        Map<String, Object> map = new LinkedHashMap<String, Object>();
        List<Word> list = new ArrayList<Word>();
       /* Word word = new Word();
        word.setId(1);
        word.setValue("开");
        word.setCommand("ON");
        word.setPinyin("kai");
        word.setSynonyms("开,打开,播放");
        word.setWordsId(2);
        list.add(word);
        Word word2 = new Word();
        word2.setId(2);
        word2.setValue("开");
        word2.setCommand("ON");
        word2.setPinyin("kai");
        word2.setSynonyms("开,打开,播放");
        word2.setWordsId(3);
        list.add(word2);
*/

        map.put("word", allWord);

        Gson gson = new Gson();
        String s = gson.toJson(map);
        return s;
    }

}
