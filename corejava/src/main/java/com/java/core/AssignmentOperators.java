package com.java.core;

public class AssignmentOperators {

    public static void main(String[] args){

        int a=10;
        int result=a+=5;
        a=10;
        int result1=a-=5;
        a=10;
        int result2=a*=5;
        a=10;
        int result3=a/=5;// a=a/5
        a=13;
        int result4= a %=5;


        System.out.println("Addition:"+result);
        System.out.println("Subtraction:"+result1);
        System.out.println("Multiplication:"+result2);
        System.out.println("Divison:"+result3);
        System.out.println("Modulous:"+result4);

    }
}
