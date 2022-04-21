package com.nnoob.abstractfactory;


/**
 * @author: niezhiqiang
 * @date: 2021/5/27 09:46
 * @description:
 */
public class SqlServerStudent implements IStudent{
    @Override
    public void insertStudent(Student student) {
        System.err.println("sqlServer insert student");
    }

    @Override
    public Student getStudent(Integer id) {
        System.err.println("sqlServer get student");
        return new Student();
    }
}
