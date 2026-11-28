package com.java.core.collections;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> employees = new ConcurrentHashMap<>();
        //employees.put(1,"cam");
        employees.put(2, "sai");
        employees.put(3, "lon");
        employees.put(1, "zow");
        // employees.put(null, "zow");
        System.out.println(employees);
        System.out.println(employees.get(3));
        employees.remove(1);
        System.out.println(employees);
    }
}