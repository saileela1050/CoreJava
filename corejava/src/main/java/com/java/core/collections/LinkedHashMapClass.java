package com.java.core.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {


    public static void main(String[] args) {

        Map<Integer, String> employees = new LinkedHashMap<>();
        //employees.put(1,"cam");
        employees.put(2, "sai");
        employees.put(3, "lon");
        employees.put(1, "zow");
        for (Map.Entry<Integer, String> map : employees.entrySet()) {
            System.out.println(map.getKey()+""+map.getValue());
        }
    }
}
