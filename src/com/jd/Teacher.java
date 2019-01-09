package com.jd;

public class Teacher {
    private String name;
    private String title;

//    /**
//     * functiong: Java重载
//     * @param n
//     * @param t
//     */
//    public Teacher(String n, String t){
//        name = n;
//        title = t;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public String getName(boolean hasTitle){
//        if(hasTitle){
//            return name + title;
//        }else {
//            return name;
//        }
//    }
    public Teacher(){
        System.out.println("这是调用了Teacher（）");
    }

    public Teacher(String n){
        name = n;
        System.out.println("这是调用了Teacher（String n）");
    }
    public Teacher(String n, String t){
        name = n;
        title = t;
        System.out.println("这是调用了Teacher（String n, String t）");
    }
}
