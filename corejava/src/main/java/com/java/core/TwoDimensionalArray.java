package com.java.core;

public class TwoDimensionalArray {

    public static void main(String[] args){

        int[][] array={
                {10,20,30},
                {54,7,10},
                {90,8,1}
        };
//        System.out.println(array[0][0]);
//        System.out.println(array[0][1]);
//        System.out.println(array[2][1]);

        for(int i=0;i<array.length;i++){
            for(int j=0;j< array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    }

