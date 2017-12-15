package com.xmyy.vmp.buz.domain;

/**
 * @author liuyi@stjf.com
 * @Date 12/13/2017 4:15 PM
 * @Vendor XMYY Information Technology Co.,Ltd.
 * <p>
 * 常用提示语实体类
 **/

public class Tip {
    //提示语id
    private int id;
    //提示语编码
    private String code;
    //提示语
    private String tip;

    public Tip() {
    }

    public Tip(int id, String code, String tip) {
        this.id = id;
        this.code = code;
        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Hint{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", hint='" + tip + '\'' +
                '}';
    }
}
