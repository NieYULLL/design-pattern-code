package com.nnoob.abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @author: niezhiqiang
 * @date: 2021/5/27 09:49
 * @description:
 */
public class DataAccess {

    private static String database;

    private DataAccess() {
    }

    public static IStudent getStudent() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.nnoob.abstractfactory." + database + "Student");
        return (IStudent) aClass.getDeclaredConstructor().newInstance();
    }

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("/Users/niezhiqiang/git-project/design-pattern-code/src/com/nnoob/abstractfactory/db.properties"));
            database = (String) properties.get("database");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
