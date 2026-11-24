package com.java.core;

public class ClassAndObject {

    int id;
    String name;

     void display(){
        System.out.println(id);
         System.out.println(name);

    }
    public static void main(String[] args){
         ClassAndObject emp=new ClassAndObject();
         emp.id=101;
         emp.name="saop";
        emp.display();
    }
}
