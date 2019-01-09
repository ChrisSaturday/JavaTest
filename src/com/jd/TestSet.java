package com.jd;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String args[]){
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        System.out.println("HashSet: " + set);

        Set<String> set1 = new TreeSet<>();
        set1.add("D");
        set1.add("A");
        set1.add("C");
        set1.add("F");
        set1.add("H");
        set1.add("B");
        System.out.println("TreeSet: " + set1);
    }
}
