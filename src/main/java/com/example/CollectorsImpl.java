package com.example;

import com.annotation.PrintMethod;
import com.domain.Object;
import com.domain.User;
import com.example.service.CollectorsService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsImpl implements CollectorsService {
    private final List<User> objects;

    public CollectorsImpl(List<User> objects) {
        this.objects = objects;
    }

    @Override
    @PrintMethod
    public Map<String, List<String>> grouping() {
        return objects.stream().
                collect(groupingBy(User::getAllRoles, mapping(User::getLastName, toList())));
    }

    @Override
    @PrintMethod
    public Map<String, Long> counting() {
        return objects.stream().collect(groupingBy(User::getSurName, Collectors.counting()));
    }

    @Override
    @PrintMethod
    public String joining() {
        try {
            return objects.stream().map(Object::getName).collect(Collectors.joining(", "));
        } catch (NullPointerException e) {
            throw new NullPointerException();
        }
    }

    @Override
    @PrintMethod
    public int summingInt() {
        return objects.stream().collect(Collectors.summingInt(User::countRoles));
    }
}
