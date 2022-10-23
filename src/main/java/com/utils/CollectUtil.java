package com.utils;

import com.domain.Object;

import java.util.*;

public class CollectUtil {
    public static List<? extends Object> cutList(List<? extends Object> list, int size) {
        int index = 0;
        List<Object> newList = new ArrayList<>();
        for (Object pair: list) {
            if (index > size) {
                break;
            } else {
                index++;
                newList.add(pair);
            }
        }

        return newList;
    }

    private static Map<Object, Object> cutMap(Map<Object, Object> collection, int size) {
        Map<Object, Object> map = new HashMap<>();

        int index = 0;

        for (Map.Entry<Object, Object> item: collection.entrySet()) {
            if (index > size) {
                break;
            } else {
                map.put(item.getKey(), item.getValue());
            }
        }

        return map;
    }
}
