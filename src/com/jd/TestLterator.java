package com.jd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * boolean hashNext: 如果被遍历的集合元素还没有被遍历完，则返回true，否则返回false
 * object Next(): 返回集合里的下一个元素
 * void Remove(): 删除集合中上一个返回的方法
 */
public class TestLterator {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String set = (String) iterator.next();
            System.out.println("集合元素为： " + set);
            if (set.equals("B")){
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }
}
