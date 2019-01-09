package com.jd;

public class TestInner {
    public static void main(String args[]){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.doSomething();
    }
}
