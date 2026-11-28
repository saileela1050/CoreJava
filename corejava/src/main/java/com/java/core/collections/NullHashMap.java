package com.java.core.collections;

import java.util.HashMap;
import java.util.Map;

public class NullHashMap {


    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<>();
        map.put(null,"sai");
        map.put(2,null);
        map.put(null,"lki");
        map.put(3,null);
        map.put(4,"sai");
        System.out.println(map);
    }
}
