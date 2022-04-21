package com.nnoob.zerenlian;

/**
 * @author: niezhiqiang
 * @date: 2021/6/19 21:21
 * @description: 检查请求数量限制
 */
public class ThrottlingMiddleware extends MiddleWare{


    @Override
    public boolean check(String email, String password) {
        System.err.println("ThrottlingMiddleware checked");
        return checkNext(email,password);
    }
}
