package com.example;

import com.domain.Object;
import com.domain.User;
import com.domain.annotation.Logger;

import java.util.List;

@Logger(CollectionsTest.class)
public class CollectionsTest {
    private final List<User> users;

    public CollectionsTest(List<User> users) {
        this.users = users;
    }

    public void mapCollections(List<Object> objects) {

    }
}
