package com.nnoob.zerenlian;

/**
 * @author: niezhiqiang
 * @date: 2021/6/19 21:27
 * @description:
 */
public class Client {


    private  static   Server server;


    public static void main(String[] args) {
        init();


        server.login("asd","asd");

    }

    private static void init() {
        server = new Server();

        MiddleWare middleWare = new ThrottlingMiddleware();
        middleWare.linkNext(new UserExistsMiddleware())
                .linkNext(new RoleCheckMiddleware());
        server.setMiddleWare(middleWare);

    }

}
