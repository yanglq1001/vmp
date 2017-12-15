package com.xmyy.vmp.buz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author liuyi@stjf.com
 * @Date 12/12/2017 10:28 AM
 * @Vendor XMYY Information Technology Co.,Ltd.
 * <p>
 * 词条实体类
 **/
@Entity
public class Word {
    // 词条ID
    @Id
    @GeneratedValue
    private int id;

    // 词条值
    private String value;

    // 拼音
    private String pinyin;

    // 值的同义词
    private String synonyms;

    //如果词条所属的词库类型为command时,词条还需要command值
    private String command;

    //词库ID
    private int wordsId;

    public Word() {
    }

    public Word(String value, String pinyin, String synonyms, String command, int wordsId) {
        this.value = value;
        this.pinyin = pinyin;
        this.synonyms = synonyms;
        this.command = command;
        this.wordsId = wordsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getWordsId() {
        return wordsId;
    }

    public void setWordsId(int wordsId) {
        this.wordsId = wordsId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", synonyms=" + synonyms +
                ", command='" + command + '\'' +
                ", wordsId=" + wordsId +
                '}';
    }
}
