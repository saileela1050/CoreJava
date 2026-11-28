package com.java.core.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

    public static void main(String[] args){

        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(80);

        System.out.println(set1);
        set1.remove(20);
        System.out.println(set1);
        System.out.println(set1.contains(20));
    }
}
