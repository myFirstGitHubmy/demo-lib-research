package com.domain;

import com.utils.GenerateUtil;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class User extends Object{

    private String lastName;
    private String surName;
    private String email;
    private String number;
    private boolean isLogin;
    private List<Role> roles;


    public User(String lastName, String surName, String email, String ident, String number, String... roles) {
        super(String.join(" ", lastName, surName), ident);
        this.lastName = lastName;
        this.surName = surName;
        this.email = email;
        this.number = number;
        this.roles = new Role(roles).getRoles();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> role) {
        this.roles = role;
    }

    public String getAllRoles() {
        return roles.stream().map(Object::getName).collect(Collectors.joining(", "));
    }
}
