package com.utils;

import com.domain.Role;
import com.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateUtil {
    private int id;
    private static List<String> names;
    private static List<String> surNames;

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
        List<User> users = new ArrayList<>();
        for(int i = 0; i < countUser; i++) {
            String name = getName();
            users.add(new User(
                            name,
                            getSurName(),
                            Separator.UNDERSCORE.getTitle(),
                            String.join(User.IDENT, Separator.UNDERSCORE.getTitle(), name),
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

    public static String getName() {
        initNames();
        Collections.shuffle(names);
        return names.stream().findFirst().orElse(null);
    }

    public static String getSurName() {
        initSurNames();
        Collections.shuffle(surNames);
        return surNames.stream().findFirst().orElse(null);
    }

    private static void initNames() {
        names = Arrays.asList(
                "James",
                "Robert",
                "John",
                "Michael",
                "David",
                "William",
                "Richard",
                "Joseph",
                "Thomas",
                "Charles",
                "Mary",
                "Patricia",
                "Jennifer",
                "Linda",
                "Elizabeth",
                "Barbara",
                "Susan",
                "Jessica",
                "Sarah",
                "Karen"
        );
    }

    private static void initSurNames() {
        surNames = Arrays.asList(
                "Smith",
                "Jones",
                "Taylor",
                "Williams"
//                "Brown",
//                "White",
//                "Harris",
//                "Martin",
//                "Davies",
//                "Wilson",
//                "Cooper",
//                "Evans",
//                "King",
//                "Turner",
//                "Martin",
//                "Cooper",
//                "Hill",
//                "Ward",
//                "Baker",
//                "Morris"
        );
    }
}
