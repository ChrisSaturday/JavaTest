package com.jd;

/**\
 * function: 单例设计模式
 */

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("私有的构造器");
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
