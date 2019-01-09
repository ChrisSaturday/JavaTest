package com.jd;

public class Iphone {
    public final String type;

    public Iphone(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void sendMsg(final String number, final String msg){
        System.out.println("给"+ number + "发送" + msg);
    }
}
