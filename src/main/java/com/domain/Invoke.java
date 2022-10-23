package com.domain;

import com.annotation.PrintMethod;
import com.utils.PrintUtil;
import org.pacesys.reflect.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class Invoke {
    java.lang.Object inst;
    Class<?> type;

    public Invoke(java.lang.Object inst, Class<?> type) {
        this.inst = inst;
        this.type = type;
    }

    public void init() {
        List<Method> methods = Reflect.on(type).methods().annotatedWith(PrintMethod.class);
        methods.forEach(m -> {
            try {
                printInvoke(m.getName());
                print(m.getReturnType(), m.invoke(inst));
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }

    private void printInvoke(String nameMethod) {
        System.out.print(type + "." + nameMethod + ": ");
    }

    private void print(java.lang.Object type, java.lang.Object object) {

        if (type instanceof Map) {
            PrintUtil.printMap((Map<?, ?>) object);
        } else if (type instanceof String) {
            PrintUtil.printString((String) object);
        } else if (type instanceof List) {
            PrintUtil.printList((List<?>) object);
        } else if (object != null) {
            PrintUtil.print(object);
        }

        System.out.println();
    }
}
