package com.java.core.collections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] args) {

        Map<Integer, String> employees = new TreeMap<>(Collections.reverseOrder());
        //employees.put(1,"cam");
        employees.put(2, "sai");
        employees.put(3, "lon");
        employees.put(1, "zow");
System.out.println(employees);
    }
}
