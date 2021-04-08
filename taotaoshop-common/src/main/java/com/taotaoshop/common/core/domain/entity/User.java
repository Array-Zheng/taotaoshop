package com.taotaoshop.common.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.taotaoshop.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 用户对象
 * @author zwr
 */
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /**用户id**/
    private String userId;
    /**用户名**/
    private String username;
    /**密码**/
    private String password;
    /**盐加密**/
    private String salt;
    /**电话**/
    private String phone;
    /**真实姓名**/
    private String realName;
    /**性别**/
    private String sex;
    /**头像地址**/
    private String avatar;
    /**邮箱**/
    private String email;
    /**账号状态**/
    private String status;
    /**用户类型**/
    private String userType;
    /**删除标志**/
    private String flgDel;
    /**密码更新时间**/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pwdUpdateTime;

    public User(){

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getFlgDel() {
        return flgDel;
    }

    public void setFlgDel(String flgDel) {
        this.flgDel = flgDel;
    }

    public Date getPwdUpdateTime() {
        return pwdUpdateTime;
    }

    public void setPwdUpdateTime(Date pwdUpdateTime) {
        this.pwdUpdateTime = pwdUpdateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", realName='" + realName + '\'' +
                ", sex='" + sex + '\'' +
                ", avatar='" + avatar + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", userType='" + userType + '\'' +
                ", flgDel='" + flgDel + '\'' +
                ", pwdUpdateTime=" + pwdUpdateTime +
                '}';
    }
}
