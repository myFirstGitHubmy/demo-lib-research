package com.domain;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    HashMap<Class<?>, java.lang.Object> classes;

    public Logger(HashMap<Class<?>, java.lang.Object> map) {
        this.classes = map;
    }

    public void run() {
        for (Map.Entry<Class<?>, java.lang.Object> obj : classes.entrySet()) {
            new Invoke(obj.getValue(), obj.getKey())
                    .init();
        }
    }
}
