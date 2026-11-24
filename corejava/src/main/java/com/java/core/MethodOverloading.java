package com.java.core;
 class Calculation{
     public int add(int a,int b){
         return a+b;
     }
     public int add(int a,int b,int c){
         return a+b+c;
     }
     public double add(double a,double b){
         return a+b;
     }
 }


public class MethodOverloading {

     public static void main(String[] args){
         Calculation cal=new Calculation();


         System.out.println(cal.add(1,2));
         System.out.println(cal.add(4,5,8));
         System.out.println(cal.add(5.2,2.4));
     }
}
