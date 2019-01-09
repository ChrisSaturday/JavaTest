package com.jd;

public class TestFinal {
    public static void main(String args[]){
        Iphone iphone = new Iphone("iphoneX");
        System.out.println(iphone.getType());
        iphone.sendMsg("15144555567", "今天是个好天气");
    }
}
