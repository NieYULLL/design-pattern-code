package com.nnoob.zerenlian;

/**
 * @author: niezhiqiang
 * @date: 2021/6/19 21:25
 * @description:
 */
public class Server {

    private  MiddleWare middleWare;

    public Server(MiddleWare middleWare) {
        this.middleWare = middleWare;
    }

    public Server() {
    }

    public MiddleWare getMiddleWare() {
        return middleWare;
    }

    public void setMiddleWare(MiddleWare middleWare) {
        this.middleWare = middleWare;
    }

    public boolean login(String email, String password) {
        return middleWare.check(email, password);

    }



}
