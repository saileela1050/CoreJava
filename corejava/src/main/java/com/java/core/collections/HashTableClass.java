package com.java.core.collections;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashTableClass {

    public static void main(String[] args) {

        Hashtable<Integer, String> employees = new Hashtable<>();
        //employees.put(1,"cam");
        employees.put(2, "sai");
        employees.put(3, "lon");
        employees.put(1, "zow");
       // employees.put(null, "zow");
       System.out.println(employees);
        System.out.println(employees.get(2));
        employees.remove(3);
        System.out.println(employees);
    }
}
