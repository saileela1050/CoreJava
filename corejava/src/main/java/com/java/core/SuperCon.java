package com.java.core;

class Emp{
    Emp(){
        System.out.println("parent");
    }

}
class Emps extends Emp{

    Emps(){
        super();
        System.out.println("Child");
    }
}
public class SuperCon {

    public static void main(String[] args){
        Emps em=new Emps();


    }
}
