package com.example.cherrycakes;

public class userHelperClass {

    String name, mobile, address;

    public userHelperClass() {

    }

    public userHelperClass(String name, String mobile, String address) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

