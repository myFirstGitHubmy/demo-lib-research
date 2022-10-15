package com.example;

import com.domain.Object;
import com.domain.User;
import com.domain.annotation.Logger;
import com.domain.annotation.PrintMethod;
import com.utils.GenerateUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static java.util.stream.Collectors.*;

@Logger(CollectorsTest.class)
public class CollectorsTest {
    private final List<User> objects;

    public CollectorsTest(List<User> objects) {
        this.objects = objects;
    }

    @PrintMethod
    public void mapCollectors() {
        System.out.println("================ COLLECTORS.MAP ==================\n" +
                "=========================================================");
    }

    @PrintMethod
    public void grouping() {
        System.out.println(objects.stream().collect(groupingBy(User::getAllRoles, mapping(User::getLastName, toList()))));
    }

    @PrintMethod
    public void counting() {
        System.out.println(objects.stream().collect(groupingBy(User::getSurName, java.util.stream.Collectors.counting())));
    }

    @PrintMethod
    public void joining() {
        System.out.println(objects.stream().map(Object::getName).collect(java.util.stream.Collectors.joining(", ")));
        System.out.println(objects.stream().map(obj -> obj.getId().toString()).collect(java.util.stream.Collectors.joining(", ")));
        System.out.println(objects.stream().map(User::getAllRoles).collect(java.util.stream.Collectors.joining("; ")));
    }
}
