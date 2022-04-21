package com.nnoob.decorator;

/**
 * @author: niezhiqiang
 * @date: 2021/6/22 21:41
 * @description:
 */
public class QQDecorator extends BaseDecorator{

    public QQDecorator() {
        super();
    }

    @Override
    protected void otherSendMes(String message) {
        System.err.println("qq sent");

    }

    public QQDecorator(Notifier notifier) {
        super(notifier);
    }

}
