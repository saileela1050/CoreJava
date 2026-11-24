package com.java.core;
class Obj {
    int id = 10;
    String name = "jan";

    @Override
    public String toString() {
        return id + " =" + name;
    }
}
public class Object {

    public static void main(String[] args){

Obj object=new Obj();
System.out.println(object);
    }
}
