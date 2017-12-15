package com.xmyy.vmp.buz.domain;

import java.util.Arrays;

/**
 * @author liuyi@stjf.com
 * @Date 12/12/2017 11:31 AM
 * @Vendor XMYY Information Technology Co.,Ltd.
 * <p>
 * <p>
 * 对话回复
 **/

public class Hint {
    //对话Id
    private int id;
    //对话类型 0-简单对话 1-复杂对话
    private String type;
    //对话内容
    private String[] content;
    //意图Id
    private int intentionId;

    public Hint() {
    }

    public Hint(int id, String type, String[] content, int intentionId) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.intentionId = intentionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public int getIntentionId() {
        return intentionId;
    }

    public void setIntentionId(int intentionId) {
        this.intentionId = intentionId;
    }

    @Override
    public String toString() {
        return "Hint{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", content=" + Arrays.toString(content) +
                ", intentionId=" + intentionId +
                '}';
    }
}
