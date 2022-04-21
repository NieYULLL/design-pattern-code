package com.nnoob.strategy;

/**
 * @author: niezhiqiang
 * @date: 2021/6/24 09:23
 * @description:
 */
public class WorkStrategy implements RouteStrategy{
    @Override
    public String builtRoute(String desc) {
        return "work";
    }
}
