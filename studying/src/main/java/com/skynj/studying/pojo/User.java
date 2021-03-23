package com.skynj.studying.pojo;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/22 15:35
 * @describe HNU PROJECT
 */
public class User {
    private Integer uId;
    private String uName;
    private String email;
    private String uPwd;
    private Integer auth;
    private String salt;
    private Integer uScore;
    private Integer vip;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getuScore() {
        return uScore;
    }

    public void setuScore(Integer uScore) {
        this.uScore = uScore;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", email='" + email + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", auth=" + auth +
                ", salt='" + salt + '\'' +
                ", uScore=" + uScore +
                ", vip=" + vip +
                '}';
    }
}
