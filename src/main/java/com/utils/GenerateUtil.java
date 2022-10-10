package com.utils;

import com.domain.Role;
import com.domain.User;
import com.domain.annotation.PrintMethod;
import org.pacesys.reflect.Reflect;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import sun.reflect.MethodAccessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class GenerateUtil {
    private int id;

    public GenerateUtil() {
        id = 0;
    }

    public Long generateId() {
        incrementId();
        return (long) getId();
    }

    private void incrementId() {
        setId(++id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<User> initUsers(int countUser) {
        GenerateNameUtil generateNameUtil = new GenerateNameUtil();
        List<User> users = new ArrayList<>();
        for(int i=0; i < countUser; i++) {
            String name = generateNameUtil.getName();
            users.add(new User(
                            name,
                            generateNameUtil.getSurName(),
                            "-",
                            "user_" + name,
                            String.valueOf(Math.random()),
                            getRoles()
                    )
            );
        }
        return users;
    }

    public static String[] getRoles() {
        int countOfRole = (int) ((Math.random() * 4) + 1);
        String[] roles = new String[countOfRole];
        for (int i=0; i < countOfRole; i++) {
            roles[i] = String.valueOf(Arrays.asList(Role.ROLE.values()).get(i));
        }

        return roles;
    }

    public static void print(Object object) {
        System.err.println("================ TEST method "+ object + " ==================\n" +
                "=========================================================");
    }

    public static String invoke(Object inst, Class<?> type) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        List<Method> methods = Reflect.on(type).methods().annotatedWith(PrintMethod.class);
        methods.forEach(m -> {
            try {
                System.out.println("===== invoke - " + m.getName() + " =======");
                m.invoke(inst);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });

        return "none";
    }
}
