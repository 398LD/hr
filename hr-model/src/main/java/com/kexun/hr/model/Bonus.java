package com.kexun.hr.model;

import java.util.Date;

public class Bonus {
    private Integer bonid;

    private Integer majorkindid;

    private String majorkindname;

    private Integer majorid;

    private String majorname;

    private String humanid;

    private String humanname;

    private String bonusitem;

    private Integer bonusworth;

    private String bonusdegree;

    private String register;

    private String checker;

    private Date registtime;

    private Date checktime;

    private Integer checkstatus;

    private String remark;

    public Integer getBonid() {
        return bonid;
    }

    public void setBonid(Integer bonid) {
        this.bonid = bonid;
    }

    public Integer getMajorkindid() {
        return majorkindid;
    }

    public void setMajorkindid(Integer majorkindid) {
        this.majorkindid = majorkindid;
    }

    public String getMajorkindname() {
        return majorkindname;
    }

    public void setMajorkindname(String majorkindname) {
        this.majorkindname = majorkindname == null ? null : majorkindname.trim();
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getHumanid() {
        return humanid;
    }

    public void setHumanid(String humanid) {
        this.humanid = humanid == null ? null : humanid.trim();
    }

    public String getHumanname() {
        return humanname;
    }

    public void setHumanname(String humanname) {
        this.humanname = humanname == null ? null : humanname.trim();
    }

    public String getBonusitem() {
        return bonusitem;
    }

    public void setBonusitem(String bonusitem) {
        this.bonusitem = bonusitem == null ? null : bonusitem.trim();
    }

    public Integer getBonusworth() {
        return bonusworth;
    }

    public void setBonusworth(Integer bonusworth) {
        this.bonusworth = bonusworth;
    }

    public String getBonusdegree() {
        return bonusdegree;
    }

    public void setBonusdegree(String bonusdegree) {
        this.bonusdegree = bonusdegree == null ? null : bonusdegree.trim();
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public Integer getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}