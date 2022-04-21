package com.nnoob.decorator;

/**
 * @author: niezhiqiang
 * @date: 2021/6/22 21:40
 * @description:
 */
public abstract class BaseDecorator implements Notifier{


    private Notifier wrapper;


    protected BaseDecorator() {
    }

    protected BaseDecorator(Notifier notifier) {
        this.wrapper = notifier;
    }

    public Notifier getNotifier() {
        return wrapper;
    }

    public void setNotifier(Notifier notifier) {
        this.wrapper = notifier;
    }

    @Override
    public void sendMessage(String message) {

        wrapper.sendMessage(message);
        otherSendMes(message);
    }


    protected abstract void otherSendMes(String message);


}
