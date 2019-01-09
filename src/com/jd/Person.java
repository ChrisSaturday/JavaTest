package com.jd;

public class Person {
    public int weight;
    public String name;

    public void setName(String n){
        name = n;
    }

    public void displayName(){
        System.out.println(name);
    }

    public Person(String n){
        name = n;
    }
}
