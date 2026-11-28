package com.java.core.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

    public static void main(String[] args){

        Set<String> names=new HashSet<>();
        names.add("sai");
        names.add("han");
        names.add("jirafe");
        names.add("lion");
        names.add("han");
        names.add(null);
        //names.add(null);
        System.out.println(names);
        System.out.println(names.contains("sai"));
        System.out.println(names.size());
        names.remove("han");
        System.out.println(names);
    }
}
