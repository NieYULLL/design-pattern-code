package com.nnoob.zerenlian;

/**
 * @author: niezhiqiang
 * @date: 2021/6/19 21:34
 * @description:
 */
public class RoleCheckMiddleware extends MiddleWare{
    @Override
    public boolean check(String email, String password) {
        System.err.println("RoleCheckMiddleware checked");
        return checkNext(email,password);
    }
}
