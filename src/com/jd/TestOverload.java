package com.jd;

public class TestOverload {
    public static void main(String[] args){
//        Teacher teacher = new Teacher("chris", "james");
//        System.out.println(teacher.getName(true));
//        System.out.println(teacher.getName());

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("张三");
        Teacher teacher3 = new Teacher("张三", "李四");
    }
}
