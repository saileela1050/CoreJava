package com.java.core;

public class ThreeDimensionalArray {

    public static void main(String[] args){

        int[][][] array={
                {
                        {10, 7, 9},
                        {4,2,1},
                        {6,80,0}
                },

                {
                        {0, 7, 9},
                        {200,2,1},
                        {100,800,0}
                },

        };

        System.out.println(array[0][1][2]);
        System.out.println(array[0][1][0]);


    }
}
