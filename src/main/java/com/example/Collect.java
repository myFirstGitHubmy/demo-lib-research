package com.example;

import com.domain.User;
import com.utils.GenerateUtil;

import java.util.HashMap;
import java.util.List;


public class Collect {

    public static HashMap<Class<?>, Object> getObjects() {
        List<User> users = GenerateUtil.initUsers(15);
        HashMap<Class<?>, Object> objects = new HashMap<Class<?>, Object>();
        CollectorsImpl collectors = new CollectorsImpl(users);
        CollectionsImpl collections = new CollectionsImpl(users);
        objects.put(CollectorsImpl.class, collectors);
        objects.put(CollectionsImpl.class, collections);
        return objects;
    }
}
