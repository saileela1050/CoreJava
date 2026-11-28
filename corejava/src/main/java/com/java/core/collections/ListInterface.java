package com.java.core.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args){

        List<String> names=new ArrayList<>();
        names.add("Java");
        names.add("Spring");
        names.add("React");
        names.add("Java");

        System.out.println(names);
        System.out.println(names.get(1));
        names.set(2,"microservice");
        System.out.println(names);

        System.out.println(names.contains("Java"));

        System.out.println(names.indexOf("Java"));
        names.remove(1);
        System.out.println(names);
        System.out.println(names.size());
    }
}
