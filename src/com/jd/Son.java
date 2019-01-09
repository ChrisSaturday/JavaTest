package com.jd;

public class Son extends Person{
    public void setWeight(){
        super.weight = 100;
        System.out.println(super.weight);
    }

    public void displayName(){
        super.displayName();
    }

    public Son(String n){
        super("李四");
    }
}
