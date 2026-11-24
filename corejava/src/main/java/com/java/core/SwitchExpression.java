package com.java.core;


// java 14+ supports switch expression using ->

public class SwitchExpression {

    public static void main(String[] args){

        int day=5;
       String result= switch(day){
            case 1->"monday";
            case 2->"tuesday";
            case 3->"wednesady";
           default -> "not matched";

        };
       System.out.println(result);
    }
}
