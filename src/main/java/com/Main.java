package com;

import com.domain.User;
import com.example.CollectorsTest;
import com.utils.GenerateUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        List<User> users = GenerateUtil.initUsers(15);
        CollectorsTest collectors = new CollectorsTest(users);
        GenerateUtil.invoke(collectors, CollectorsTest.class);
    }
}
