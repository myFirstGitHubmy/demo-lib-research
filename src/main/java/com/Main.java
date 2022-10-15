package com;

import com.domain.Logger;
import com.example.Collect;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        Logger logger = new Logger(Collect.getObjects());
        logger.run();
    }
}
