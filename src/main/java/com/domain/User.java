package com.domain;

import com.domain.dto.UserDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class User extends Object {
    public static final String IDENT = "USER";

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

    public String getAllRoles() {
        return roles.stream().map(Object::getName).collect(Collectors.joining(", "));
    }

    public int countRoles() { return roles.size(); }

    public UserDto toDto() {
        return new UserDto(
                lastName,
                surName,
                email,
                number,
                isLogin,
                roles
        );
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
