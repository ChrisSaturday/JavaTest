package com.jd;

public class NewIphone extends Iphone{
    public NewIphone(String type){
        super(type);
    }

    public void sendMsg(String number, String msg){
        super.sendMsg(number, msg);
        super.sendMsg("病毒手机号", msg);

    }

}
