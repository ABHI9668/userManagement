package com.example.user.Management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.sound.sampled.EnumControl;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer userId;
    private String userName;
    private String userAddress;
    private Integer userPhoneNumber;
    public Integer getUserId() {
        return userId;

    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }



    public Integer getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(Integer userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }




}
