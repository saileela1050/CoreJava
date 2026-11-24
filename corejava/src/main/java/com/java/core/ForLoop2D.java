package com.java.core;

public class ForLoop2D {

    public static void main(String[] args){

        int[][]array={
                {10,20,29},
                {1,5,3}
        };
        for(int row[]:array){
        for(int arrays: row){
           System.out.print(arrays +" ");
        }
        System.out.println();
        }
    }
}
