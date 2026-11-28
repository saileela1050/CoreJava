package com.java.core.collections;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args){

        Vector<String> names=new Vector<>();

        names.add("sai");
        names.add("leela");
        names.add("king");

        System.out.println(names);
        names.add(1,"python");

        System.out.println(names);
        names.remove("react");
        System.out.println(names);
        System.out.println(names.size());


    }
}
