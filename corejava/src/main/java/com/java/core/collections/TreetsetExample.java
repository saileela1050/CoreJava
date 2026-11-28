package com.java.core.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreetsetExample {

    public static void main(String[] args) {

        TreeSet<Integer> names = new TreeSet<>();
        names.add(1);
        names.add(29);
        names.add(30);
        names.add(89);
        names.add(10);

        //   names.add(null);
        System.out.println(names);

        System.out.println(names.first());
        System.out.println(names.last());
        System.out.println(names.higher(10));
        System.out.println(names.lower(80));
        System.out.println(names.descendingSet());
    }
}
