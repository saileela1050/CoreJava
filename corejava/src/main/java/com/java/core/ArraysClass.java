package com.java.core;

import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args){

        int[] arrays={10,20,1,20,3,90,100};
        int[] copy=Arrays.copyOf(arrays,9);
        int index=Arrays.binarySearch(arrays,90);

        int[]a={10,20};
        int[]b={10,20};
       int[][] numbers={ {10,20},{10,9} };


        int[] arr=new int[5];
        Arrays.fill(arr,90);
       // String result=Arrays.toString(arrays);
       Arrays.sort(arrays);
       // System.out.println(result);
        System.out.println(Arrays.toString(arrays));
        System.out.println(index);
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(numbers));
    }
}
