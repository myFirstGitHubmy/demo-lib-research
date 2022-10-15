package com.example;

import com.domain.User;
import com.utils.GenerateUtil;

import java.util.HashMap;
import java.util.List;

public class Collect {

    public static HashMap<Class<?>, Object> getObjects() {
        List<User> users = GenerateUtil.initUsers(15);
        HashMap<Class<?>, Object> objects = new HashMap<>();
        CollectorsTest collectors = new CollectorsTest(users);
        CollectionsTest collections = new CollectionsTest(users);
        objects.put(CollectorsTest.class, collectors);
        objects.put(CollectionsTest.class, collections);
        return objects;
    }
}
