package com.xmyy.vmp.buz.domain;

import java.util.List;

/**
 * @author liuyi@stjf.com
 * @Date 12/12/2017 10:28 AM
 * @Vendor XMYY Information Technology Co.,Ltd.
 * <p>
 * 词库实体类
 **/

public class Words {
    //词库ID
    private int id;

    //词库名称
    private String name;

    /*
    词库类型:
    0-command   命令类
    1-word      普通类
    2-device    设备类
    3-floor     楼层类
    4-area      区域类
     */
    private String type;

    //词库所含词组
    private List<Word> wordList;

    public Words() {
    }

    public Words(int id, String name, String type, List<Word> wordList) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.wordList = wordList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    @Override
    public String toString() {
        return "Words{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", wordList=" + wordList +
                '}';
    }
}
