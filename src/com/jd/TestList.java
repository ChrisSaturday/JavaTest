package com.jd;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String args[]){
        List<Object> list = new ArrayList<>();
        list.add("One" );
        list.add("Two");
        list.add("Three");
        list.add(new Integer(4));
        list.add(new Float(5.0F));
        list.add("Two");
        list.add(new Integer(4));
        System.out.println(list.toString());
    }
}
