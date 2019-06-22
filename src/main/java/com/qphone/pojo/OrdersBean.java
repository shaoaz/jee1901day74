package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersBean {
    private BigDecimal oid;

    private BigDecimal uuid;

    private String orealid;

    private String oname;

    private String otime;

    private String omoney;

    private String onumber;

    private String oststus;

    private Date oweilai;

    private BigDecimal oshengyu;

    private Integer pchou;

    private Integer pmoney;

    public Integer getPchou() {
        return pchou;
    }

    public void setPchou(Integer pchou) {
        this.pchou = pchou;
    }

    public Integer getPmoney() {
        return pmoney;
    }

    public void setPmoney(Integer pmoney) {
        this.pmoney = pmoney;
    }

    public Date getOweilai() {
        return oweilai;
    }

    public void setOweilai(Date oweilai) {
        this.oweilai = oweilai;
    }

    public BigDecimal getOshengyu() {
        return oshengyu;
    }

    public void setOshengyu(BigDecimal oshengyu) {
        this.oshengyu = oshengyu;
    }

    public BigDecimal getOid() {
        return oid;
    }

    public void setOid(BigDecimal oid) {
        this.oid = oid;
    }

    public BigDecimal getUuid() {
        return uuid;
    }

    public void setUuid(BigDecimal uuid) {
        this.uuid = uuid;
    }

    public String getOrealid() {
        return orealid;
    }

    public void setOrealid(String orealid) {
        this.orealid = orealid == null ? null : orealid.trim();
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public String getOmoney() {
        return omoney;
    }

    public void setOmoney(String omoney) {
        this.omoney = omoney == null ? null : omoney.trim();
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }

    public String getOststus() {
        return oststus;
    }

    public void setOststus(String oststus) {
        this.oststus = oststus == null ? null : oststus.trim();
    }

    @Override
    public String toString() {
        return "OrdersBean{" +
                "oid=" + oid +
                ", uuid=" + uuid +
                ", orealid='" + orealid + '\'' +
                ", oname='" + oname + '\'' +
                ", otime=" + otime +
                ", omoney='" + omoney + '\'' +
                ", onumber='" + onumber + '\'' +
                ", oststus='" + oststus + '\'' +
                '}';
    }

  /*  @Override
    public boolean equals(Object o) {
        if (o != null) {
            OrdersBean aa = (OrdersBean) o;
            return this.oname.equals(aa.getOname());
        }
        return false;
    }

    @Override
    public int hashCode() {

        return 1;
    }*/
}