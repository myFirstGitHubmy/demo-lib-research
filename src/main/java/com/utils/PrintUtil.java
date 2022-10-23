package com.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PrintUtil {
    private static final int MAX_LENGTH_LINE = 150;

    public static void printMap(Map<?, ?> map) {
        beforeMethod();
        map.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));
    }

    public static void printList(List<?> list) {
        beforeMethod();
        list.forEach(System.out::println);
    }

    public static void printObject(Object obj) {
        System.out.println(obj.toString());
    }

    public static void printStringWithSeparator(String string, String separator) {
        String[] arrays = string.split(separator);
        Arrays.stream(arrays).forEach(System.out::println);
    }

    public static void print(String string) {
        String separator = findSeparator(string);
        if (separator != null) {
            printStringWithSeparator(string, separator);
        }

        printString(string);
    }

    public static void printString(String string) {
        if (string.length() <= MAX_LENGTH_LINE) {
            System.out.println(string);
        } else {
            System.out.println(string.substring(0, MAX_LENGTH_LINE));
            printString(string.substring(MAX_LENGTH_LINE));
        }
    }

    public static void print(Object object) {
        if (object instanceof Map) {
            printMap((Map<?, ?>) object);
        } else if (object instanceof List) {
            printList((List<?>) object);
        } else if (object instanceof String) {
            print((String) object);
        } else {
            printObject(object);
        }
    }

    public static void print(Object object, String prefix) {
        if (prefix != null) {
            System.out.printf("%s%s ",prefix, Separator.COLON.getTitle());
        }
        if (object instanceof Map) {
            printMap((Map<?, ?>) object);
        } else if (object instanceof List) {
            printList((List<?>) object);
        } else if (object instanceof String) {
            print((String) object);
        } else {
            printObject(object);
        }
    }

    private static String findSeparator(String str) {
        for (Separator pair : Separator.values()) {
            if (str.indexOf(pair.getTitle()) > 0) {
                return pair.getTitle();
            }
        }

        return null;
    }

    private static void beforeMethod() {
        System.out.println();
    }
}
