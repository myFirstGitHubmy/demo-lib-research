package com.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateNameUtil {
    private List<String> names;
    private List<String> surNames;

    public String getName() {
        initNames();
        Collections.shuffle(names);
        return names.stream().findFirst().orElse(null);
    }

    public String getSurName() {
        initSurNames();
        Collections.shuffle(surNames);
        return surNames.stream().findFirst().orElse(null);
    }

    private void initNames() {
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

    private void initSurNames() {
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
