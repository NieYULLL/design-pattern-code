package com.nnoob.decorator;

/**
 * @author: niezhiqiang
 * @date: 2021/6/22 21:42
 * @description:
 */
public class WeChatDecorator extends BaseDecorator{


    @Override
    protected void otherSendMes(String message) {

        System.err.println("wechat sent");

    }
}
