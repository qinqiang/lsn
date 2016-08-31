package com.qin.lsn.service.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "T_B_CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(generator = "CUSTOMER_SEQ")
    @SequenceGenerator(name = "CUSTOMER_SEQ", sequenceName = "SEQ_T_B_CUSTOMER")
    @Column(name = "ID", columnDefinition = "NUMBER(12)", nullable = false)
    private Long id; // 编号
    @Column(name = "NAME", columnDefinition = "VARCHAR2(32)")
    private String name; // 姓名
    @Column(name = "SEX", columnDefinition = "NUMBER(1)")
    private String sex; // 性别 0女，1男
    @Column(name = "PHONE_NUMBER", columnDefinition = "VARCHAR2(12)")
    private String phoneNumber; // 电话号码
    @Column(name = "MOBILE_NUMBER", columnDefinition = "VARCHAR2(11)")
    private String mobileNumber; // 手机号码
    @Column(name = "BIRTHDAY", columnDefinition = "VARCHAR2(8)")
    private String birthday; // 会员生日
    @Column(name = "REGISTER_DATE", columnDefinition = "VARCHAR2(8)")
    private String registerDate; // 注册日期
    @Column(name = "REGISTER_TIME", columnDefinition = "VARCHAR2(6)")
    private String registerTime; // 注册时间
    @Column(name = "BALANCES", columnDefinition = "NUMBER(12,2)")
    private BigDecimal balances; // 余额
    @Column(name = "SCORE", columnDefinition = "NUMBER(12,2)")
    private BigDecimal score; // 积分
    @Column(name = "COUNT", columnDefinition = "NUMBER(12)")
    private BigDecimal count; // 剩余次数
    @Column(name = "STATUS", columnDefinition = "NUMBER(1)")
    private String status; // 会员状态 0开启，1关闭

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public BigDecimal getBalances() {
        return balances;
    }

    public void setBalances(BigDecimal balances) {
        this.balances = balances;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
