package com.suji.spagent.springboot.model;

public class User {
    private int userNo;
    private String userName;
    private String userId;
    private String userPw;
    
    public User(){

    }

    public User(int userNo, String userName, String userId, String userPw){
        this.userNo = userNo;
        this.userName = userName;
        this.userId = userId;
        this.userPw = userPw;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }
}
