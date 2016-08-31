package com.qin.lsn.service.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "T_L_TRANS")
public class Trans {

    @Id
    @GeneratedValue(generator = "TRANS_SEQ")
    @SequenceGenerator(name = "TRANS_SEQ", sequenceName = "SEQ_T_L_TRANS")
    @Column(name = "ID", columnDefinition = "NUMBER(12)", nullable = false)
    private String id;
    @Column(name = "CUSTOMER_ID", columnDefinition = "NUMBER(12)")
    private String customerId;
    @Column(name = "TRAN_TYPE", columnDefinition = "NUMBER(1)")
    private String tranType; //0.消费 1.充值
    @Column(name = "TRAN_AMT", columnDefinition = "NUMBER(12,2)")
    private BigDecimal tranAmt;
    @Column(name = "TRAN_DATE", columnDefinition = "VARCHAR2(8)")
    private String tranDate;
    @Column(name = "TRAN_TIME", columnDefinition = "VARCHAR2(6)")
    private String tranTime;
    @Column(name = "USERNAME", columnDefinition = "VARCHAR2(32)")
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
