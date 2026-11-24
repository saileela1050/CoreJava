package com.java.core;

import java.util.Arrays;

public class FinalArray {

    public static void main(String[] args){

        final int[] arr={10,8,1};
       // arr=new int[]{10,90,8};
        arr[0]=20;

        System.out.println(Arrays.toString(arr));
    }
}
