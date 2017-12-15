package com.xmyy.vmp.controller;

import com.google.gson.Gson;
import com.xmyy.vmp.domain.Word;
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

    @RequestMapping("/all")
    public String getWord() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        List<Word> list = new ArrayList<Word>();
        Word word = new Word();
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


        map.put("words", list);

        Gson gson = new Gson();
        String s = gson.toJson(map);
        return s;
    }

}
