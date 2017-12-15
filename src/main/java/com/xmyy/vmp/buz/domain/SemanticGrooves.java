package com.xmyy.vmp.buz.domain;

/**
 * @author liuyi@stjf.com
 * @Date 12/12/2017 11:15 AM
 * @Vendor XMYY Information Technology Co.,Ltd.
 * <p>
 * 语义槽实体类
 **/

public class SemanticGrooves {
    //语义槽Id
    private int id;

    //语义槽名称
    private String name;

    //对应词库
    private Words wordsList;

    //优先级 值越小优先级越高
    private int priortity;

    //是否必须 1-必须 0-非必须
    private int required;

    //意图ID
    private int intentionId;

    //提问
    private String question;

}
