package com.zr.yuegou_single.entity;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userPhone;

    private Byte userStatus;

    private Date userCreatetime;

    private Date userUpdatetime;

    private String userCreateuser;

    private String userUpdateuser;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public Date getUserUpdatetime() {
        return userUpdatetime;
    }

    public void setUserUpdatetime(Date userUpdatetime) {
        this.userUpdatetime = userUpdatetime;
    }

    public String getUserCreateuser() {
        return userCreateuser;
    }

    public void setUserCreateuser(String userCreateuser) {
        this.userCreateuser = userCreateuser == null ? null : userCreateuser.trim();
    }

    public String getUserUpdateuser() {
        return userUpdateuser;
    }

    public void setUserUpdateuser(String userUpdateuser) {
        this.userUpdateuser = userUpdateuser == null ? null : userUpdateuser.trim();
    }
}