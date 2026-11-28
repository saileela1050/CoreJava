package com.java.core.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args){

        Set<Integer> set1=new HashSet<>(Arrays.asList(10,20,30));
        Set<Integer> set2=new HashSet<>(Arrays.asList(20,30,40));

        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> diff=new HashSet<>(set1);
        diff.removeAll(set2);


        System.out.println(union);
        System.out.println(intersection);
        System.out.println(diff);

    }
}
