package com.java.core;


    class Employee{

        Employee(){
            this(105);
            System.out.println("Default");
        }
        Employee(int id){
            System.out.println("Parameterized");
        }
    }
public class ThisKey {
public static void main(String[] args){
    Employee emp=new Employee();

}
}
