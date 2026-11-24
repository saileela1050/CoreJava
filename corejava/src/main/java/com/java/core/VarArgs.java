package com.java.core;

public class VarArgs {

    static void add(int...numbers){
        int sum=0;
        for(int number: numbers){
            sum=sum+number;
        }
        System.out.println(sum);

    }

    public static void main(String args[]){
        add(10);
        add(20,10,90);


    }
}
