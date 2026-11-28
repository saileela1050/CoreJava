package com.java.core.collections;


import java.util.*;

public class Main {

    public static void main(String[] args){

        Collection<String> names=new ArrayList();
        names.add("java");
        names.add("spring");
        names.add("react");

        System.out.println(names);
        System.out.println(names.contains("spring"));
        System.out.println(names.size());
        System.out.println(names.remove("react"));
        System.out.println(names);
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);
    }
}
