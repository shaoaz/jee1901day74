package com.qphone.pojo;

import java.math.BigDecimal;

public class RewardBean {
    private BigDecimal rid;

    private BigDecimal pid;

    private String rtype;

    private String rmoney;

    private String rjieshao;

    private String rphoto;

    private String rnumber;

    private String rxiangou;

    private String ryunfei;

    private String rfapiao;

    private String rday;



    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    public BigDecimal getPid() {
        return pid;
    }

    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype == null ? null : rtype.trim();
    }

    public String getRmoney() {
        return rmoney;
    }

    public void setRmoney(String rmoney) {
        this.rmoney = rmoney == null ? null : rmoney.trim();
    }

    public String getRjieshao() {
        return rjieshao;
    }

    public void setRjieshao(String rjieshao) {
        this.rjieshao = rjieshao == null ? null : rjieshao.trim();
    }

    public String getRphoto() {
        return rphoto;
    }

    public void setRphoto(String rphoto) {
        this.rphoto = rphoto == null ? null : rphoto.trim();
    }

    public String getRnumber() {
        return rnumber;
    }

    public void setRnumber(String rnumber) {
        this.rnumber = rnumber == null ? null : rnumber.trim();
    }

    public String getRxiangou() {
        return rxiangou;
    }

    public void setRxiangou(String rxiangou) {
        this.rxiangou = rxiangou == null ? null : rxiangou.trim();
    }

    public String getRyunfei() {
        return ryunfei;
    }

    public void setRyunfei(String ryunfei) {
        this.ryunfei = ryunfei == null ? null : ryunfei.trim();
    }

    public String getRfapiao() {
        return rfapiao;
    }

    public void setRfapiao(String rfapiao) {
        this.rfapiao = rfapiao == null ? null : rfapiao.trim();
    }

    public String getRday() {
        return rday;
    }

    public void setRday(String rday) {
        this.rday = rday == null ? null : rday.trim();
    }

    @Override
    public String toString() {
        return "RewardBean{" +
                "rid=" + rid +
                ", pid=" + pid +
                ", rtype='" + rtype + '\'' +
                ", rmoney='" + rmoney + '\'' +
                ", rjieshao='" + rjieshao + '\'' +
                ", rphoto='" + rphoto + '\'' +
                ", rnumber='" + rnumber + '\'' +
                ", rxiangou='" + rxiangou + '\'' +
                ", ryunfei='" + ryunfei + '\'' +
                ", rfapiao='" + rfapiao + '\'' +
                ", rday='" + rday + '\'' +
                '}';
    }
}