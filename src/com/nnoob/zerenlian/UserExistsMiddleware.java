package com.nnoob.zerenlian;

/**
 * @author: niezhiqiang
 * @date: 2021/6/19 21:23
 * @description: 检查用户登录信息
 */
public class UserExistsMiddleware extends MiddleWare{
    @Override
    public boolean check(String email, String password) {
        System.err.println("UserExistsMiddleware checked");
        return checkNext(email,password);
    }
}
