package com.java.core;

class Parent{
    String name="poi";
}

class Child extends Parent {
    String name = "uyi";

    void display() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class SuperKeyword {

    public static void main(String[] args){

Child ch=new Child();
ch.display();
    }
}
