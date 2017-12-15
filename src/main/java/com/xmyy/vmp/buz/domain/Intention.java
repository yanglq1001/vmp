package com.xmyy.vmp.buz.domain;

import java.util.List;

/**
 * @author liuyi@stjf.com
 * @Date 12/12/2017 11:24 AM
 * @Vendor XMYY Information Technology Co.,Ltd.
 * <p>
 * 意图实体类
 **/

public class Intention {
    //意图ID
    private int id;
    //意图名称
    private String name;
    //说法规则
    private List<SemanticGrooves> sgs;
    //提示语
    private String hint;
    //用户说法
    private String[] userDemo;

}
