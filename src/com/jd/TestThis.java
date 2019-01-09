package com.jd;

public class TestThis {

    private int number;

    public TestThis create(){

        this.number ++;
        return this;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public static void main(String args[]){
        TestThis tt = new TestThis();
        int num = tt.create().create().create().create().getNumber();
        System.out.println(num);
    }
}
