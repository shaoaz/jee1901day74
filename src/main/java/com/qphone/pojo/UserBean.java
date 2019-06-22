package com.qphone.pojo;

import java.math.BigDecimal;

public class UserBean {
    private BigDecimal uuid;

    private String uname;

    private String upass;

    private String urealname;

    private String uyouxiang;

    private String uphone;

    private String utype;

    public BigDecimal getUuid() {
        return uuid;
    }

    public void setUuid(BigDecimal uuid) {
        this.uuid = uuid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass == null ? null : upass.trim();
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname == null ? null : urealname.trim();
    }

    public String getUyouxiang() {
        return uyouxiang;
    }

    public void setUyouxiang(String uyouxiang) {
        this.uyouxiang = uyouxiang == null ? null : uyouxiang.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype == null ? null : utype.trim();
    }
}