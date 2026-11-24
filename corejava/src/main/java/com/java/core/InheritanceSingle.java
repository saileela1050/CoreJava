package com.java.core;

class Paren{
    void show(){
        System.out.println("parent");
    }
}
class Chil extends Paren{
    void show(){
        System.out.println("child");
    }
}

public class InheritanceSingle {
    public static void main(String[] args){
        Chil child=new Chil();
        child.show();
    }
}
