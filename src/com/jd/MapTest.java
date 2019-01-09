package com.jd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
    public static void main(String args[]){
        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("A1", new Double(100.0));
        map.put("A2", new Double(200.0));
        map.put("A3", new Double(300.0));
        //stem.out.println(map.get("A3"));
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key:" + key + ",value:" + map.get(key));
        }
    }
}

