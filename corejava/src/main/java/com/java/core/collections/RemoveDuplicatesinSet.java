package com.java.core.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinSet {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(10,20,90,80,90);
        Set<Integer> uniqueNumbers=new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);
    }
}
