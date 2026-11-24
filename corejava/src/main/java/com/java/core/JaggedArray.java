package com.java.core;

public class JaggedArray {

    public static void main(String[] args){

        int[][] array={
            {10,20},
            {30,1,9},
            {9,5,9,0}
        };

        for(int rows[]:array){
            for(int arrays:rows){
                System.out.print(arrays +" ");
            }
            System.out.println();
        }
    }
}
