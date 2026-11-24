package com.java.core;

public class ArrayForLoop {

    public static void main(String[] args){

        int[] arr={3,9,10,4};
        String[]names={"sai","gani","manu"};
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        for(int arrays: arr){
           System.out.println(arrays);
        }
        for(String name: names){
            System.out.println(name);
        }
    }
}
