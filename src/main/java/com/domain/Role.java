package com.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Role extends Object {
    private List<Role> roles;

    public Role(String... names) {
        this.roles = Arrays.stream(names)
                .collect(ArrayList::new,
                (l, n) -> l.add(new Role(n)), List::addAll);
    }

    public Role(String name) {
        super(name, name);
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public enum ROLE {
        ADMIN("ADMIN"),
        USER("USER"),
        READER("READER"),
        EDITOR("EDITOR");

        private String title;

        ROLE(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
