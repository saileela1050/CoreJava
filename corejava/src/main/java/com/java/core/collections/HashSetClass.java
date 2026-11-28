package com.java.core.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {


    public static void main(String[] args){

        Set<String> names=new HashSet<>();
        names.add("lion");
        names.add("tiger");
        names.add("camel");
        names.add("cow");
        names.add("lion");
        System.out.println(names);

        System.out.println(names.contains("tiger"));
        System.out.println(names.size());
        System.out.println(names.remove("camel"));
    }
}
