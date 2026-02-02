package com.revpay.model;

public class User {

    private int userId;
    private String fullName;
    private String email;
    private String phone;
    private String password;
    private String userType; // PERSONAL / BUSINESS

    public User(int userId, String fullName, String email,
                String phone, String password, String userType) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public String getFullName() {
        return fullName;
    }
}

