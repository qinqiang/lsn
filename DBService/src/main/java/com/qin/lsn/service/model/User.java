package com.qin.lsn.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "T_P_USER")
public class User {

    @Id
    @GeneratedValue(generator = "USER_SEQ")
    @SequenceGenerator(name = "USER_SEQ", sequenceName = "SEQ_T_B_USER")
    @Column(name = "ID", columnDefinition = "NUMBER(12)", nullable = false, unique = true)
    private Long id;
    @Column(name = "USERNAME", columnDefinition = "VARCHAR2(32)", unique = true)
    private String username;
    @Column(name = "PWD", columnDefinition = "VARCHAR2(32)")
    private String pwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
