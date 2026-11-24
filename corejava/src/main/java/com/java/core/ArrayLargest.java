package com.java.core;

public class ArrayLargest {
    public static void main(String[] args) {


        int[] arr = {10, 90, 80, 60};
       int max=arr[0];
        for(int arrays:arr){
            if(arrays>max){
                max=arrays;
            }
        }
        System.out.println(max);
    }
}