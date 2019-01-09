package com.jd;

public class Outer {
    private int size = 11;
    public class Inner{
        public void doSomething(){
            size++;
            System.out.println(size);
        }
    }

    public void createInner(){
        Inner inner = new Inner();
        inner.doSomething();
    }

//    public static void main(String args[]){
//        Outer outer = new Outer();
//        outer.createInner();
//    }
}
