package com.java.core;

class GrandParent{

    void showGrandParent(){
        System.out.println("grand");
    }
}
class Parent1 extends GrandParent{

    void showParent(){
        System.out.println("parent");
    }
}

class Child1 extends Parent1{

    void showChild(){
        System.out.println("child");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args){
        Child1 child=new Child1();
        child.showGrandParent();
        child.showParent();
        child.showChild();


    }
}
