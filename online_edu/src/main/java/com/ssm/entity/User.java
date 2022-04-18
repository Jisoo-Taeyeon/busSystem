package com.ssm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description User 实体类  用户信息
 * @Author lvyicheng
 * @Date 2022/4/18 11:09
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1753934078071726878L;

    private Integer id;

    private String name;

    private String protrait;

    private String phone;

    private String password;

    private String regIp;

    private Object accountNonExpired;

    private Object credentialsNonExpired;

    private Object accountNonLocked;

    private String status;

    private Object isDel;

    private Date createTime;

    private Date updateTime;


    public Object getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtrait() {
        return protrait;
    }

    public void setProtrait(String protrait) {
        this.protrait = protrait;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Object getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Object accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Object getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Object credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Object getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Object accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getIsDel() {
        return isDel;
    }

    public void setIsDel(Object isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", protrait='" + protrait + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", regIp='" + regIp + '\'' +
                ", accountNonExpired=" + accountNonExpired +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", accountNonLocked=" + accountNonLocked +
                ", status='" + status + '\'' +
                ", isDel=" + isDel +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
