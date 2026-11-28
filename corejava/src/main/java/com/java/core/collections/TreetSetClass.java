package com.java.core.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreetSetClass {
    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();
        names.add("sai");
        names.add("han");
        names.add("jirafe");
        names.add("lion");
        names.add("han");
     //   names.add(null);
        System.out.println(names);

       // System.out.println(names.first());
    }
}