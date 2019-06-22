package com.qphone.pojo;

import java.math.BigDecimal;

public class AddressBean {
    private BigDecimal aid;

    private BigDecimal uuid;

    private String aname;

    private String aphone;

    private String aaddress;

    public BigDecimal getAid() {
        return aid;
    }

    public void setAid(BigDecimal aid) {
        this.aid = aid;
    }

    public BigDecimal getUuid() {
        return uuid;
    }

    public void setUuid(BigDecimal uuid) {
        this.uuid = uuid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getAaddress() {
        return aaddress;
    }

    public void setAaddress(String aaddress) {
        this.aaddress = aaddress == null ? null : aaddress.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            AddressBean addr = (AddressBean) o;
            return this.aname.equals(addr.getAname()) && this.aaddress.equals(addr.getAaddress());
        }
        return false;
    }

    @Override
    public int hashCode() {

        return 1;
    }
}