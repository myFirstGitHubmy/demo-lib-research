package com.example;

import com.annotation.PrintMethod;
import com.domain.Object;
import com.domain.User;
import com.domain.dto.UserDto;
import com.utils.CollectUtil;
import com.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsImpl {
    private final List<User> users;

    public CollectionsImpl(List<User> users) {
        this.users = users;
    }

    @PrintMethod
    public void singletonMap() {
        User user = anyUser();
        System.out.println(Collections.singletonMap(user.getSurName(), user.getAllRoles()));
    }

    public void mapCollections(List<Object> objects) {

    }

    @PrintMethod
    public void copy() {
        int size = 4;
        try {
            List<User> copyList = new ArrayList<>(size);
            List<User> userForCopy = (List<User>) CollectUtil.cutList(users, size);
            PrintUtil.print(userForCopy, "users");
            Collections.copy(copyList, userForCopy);
            PrintUtil.print(copyList, "copyList");
        } catch (Exception e) {

        }

    }

    private User anyUser() {
        Collections.shuffle(users);
        return users.get(0);
    }
}
