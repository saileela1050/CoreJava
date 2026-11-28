package com.java.core.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args){

        Map<Integer,String> employees=new HashMap<>();
        //employees.put(1,"cam");
        employees.put(2,"sai");
        employees.put(3,"lon");
        employees.put(1,"zow");

        // iterate through map
        for(Map.Entry<Integer,String> entry:employees.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        System.out.println(employees);
        System.out.println(employees.get(3));
        System.out.println(employees.containsKey(2));

        employees.put(1,"don");
        System.out.println(employees);
    }
}
