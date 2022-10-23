package com.domain.dto;

import com.domain.Role;

import java.util.List;

public class UserDto {
    private String lastName;
    private String surName;
    private String email;
    private String number;
    private boolean isLogin;
    private List<Role> roles;

    public UserDto(String lastName, String surName, String email, String number, boolean isLogin, List<Role> roles) {
        this.lastName = lastName;
        this.surName = surName;
        this.email = email;
        this.number = number;
        this.isLogin = isLogin;
        this.roles = roles;
    }

    public String toString() {
       return String.format(
               "lastName = %s, " +
               "surName = %s, " +
               "email = %s",
               lastName, surName, email
       );
    }
}
