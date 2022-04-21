package com.nnoob.zerenlian;

/**
 * @author: niezhiqiang
 * @date: 2021/6/19 21:07
 * @description: 基础验证接口
 */
public abstract class MiddleWare {

    private MiddleWare nextMiddleWare;


    /**
     * 设置下一个handler
     */
    public MiddleWare linkNext(MiddleWare middleWare){
        this.nextMiddleWare=middleWare;
        return middleWare;
    }


    public  abstract boolean check(String email,String password);


    protected boolean checkNext(String email,String password){

        if (null==nextMiddleWare){
            return true;
        }
        return nextMiddleWare.check(email,password);
    }





}
