package com.java.core.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

    public static void main(String[] args){

        List<Integer> numbers=new ArrayList<>(Arrays.asList(70,10,30,70));

        Collections.sort(numbers);
        System.out.println("Sorted:"+numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed:"+numbers);
        System.out.println("Maximum:"+Collections.max(numbers));
        System.out.println("Minimum:"+Collections.min(numbers));
        System.out.println("Frequency of 10:"+Collections.frequency(numbers,10));
        Collections.swap(numbers,0,1);
        System.out.println("After swap:"+numbers);
    }
}
