package com.nnoob.decorator;

/**
 * @author: niezhiqiang
 * @date: 2021/6/22 21:54
 * @description:
 */
public class BaseNotifier implements Notifier{


    @Override
    public void sendMessage(String message) {
        System.err.println("message");
    }
}
