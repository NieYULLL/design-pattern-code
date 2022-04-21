package com.nnoob.abstractfactory;


import java.lang.reflect.InvocationTargetException;

/**
 * @author: niezhiqiang
 * @date: 2021/5/27 09:55
 * @description:
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        IStudent student = DataAccess.getStudent();
        Student student1 = student.getStudent(1);
        System.err.println(student1);
    }
}
