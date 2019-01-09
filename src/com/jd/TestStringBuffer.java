package com.jd;

public class TestStringBuffer {
    public static void main(String args[]){
        StringBuffer stringBuffer = new StringBuffer("today");
        stringBuffer.append(" Monday");
        int index = 6;
        stringBuffer.insert(index, "is ");
        index = 0;
        stringBuffer.setCharAt(index, 'T');
        int start = 9;
        int end = 12;
        stringBuffer.replace(start, end, "Satur");
        System.out.println(stringBuffer.toString());
    }
}
