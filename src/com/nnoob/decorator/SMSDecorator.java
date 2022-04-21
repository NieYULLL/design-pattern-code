package com.nnoob.decorator;

/**
 * @author: niezhiqiang
 * @date: 2021/6/22 21:41
 * @description:
 */
public class SMSDecorator extends BaseDecorator{

    public SMSDecorator() {
        super();
    }

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }


    @Override
    protected void otherSendMes(String message) {
        System.err.println("sms sent");

    }
}
