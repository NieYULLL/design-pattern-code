package com.nnoob.decorator;

/**
 * @author: niezhiqiang
 * @date: 2021/6/22 21:46
 * @description:
 */
public class Client {
    public static void main(String[] args) {

        BaseDecorator qqDecorator = new QQDecorator(new BaseNotifier());
        SMSDecorator smsDecorator = new SMSDecorator(qqDecorator);

        // smsDecorator.sendMessage("hello");
        smsDecorator.sendMessage("ahh");

    }
}
