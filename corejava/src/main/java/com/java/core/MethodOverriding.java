package com.java.core;

class Emp1{
    void show(){
        System.out.println("emp1");
    }
}
class Emp2 extends Emp1{

    @Override
    void show(){
        System.out.println("emp2");
    }
}

public class MethodOverriding {

    public static void main(String[] args){

        Emp2 emp=new Emp2();
        emp.show();
    }
}
