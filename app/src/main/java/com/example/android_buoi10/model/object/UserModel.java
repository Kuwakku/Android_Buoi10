package com.example.android_buoi10.model.object;

public class UserModel {

    private String userName, passsword;

    public UserModel() {
    }

    public UserModel(String userName, String passsword) {
        this.userName = userName;
        this.passsword = passsword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passsword='" + passsword + '\'' +
                '}';
    }
}
