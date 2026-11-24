package com.java.core;

class Parents{
    void show(){
        System.out.println("parent");
    }

}
class Childs extends Parents{

    void show(){
        System.out.println("Child");
    }
    void display(){
        show();
        super.show();

    }
}
public class SuperKey {

    public static void main(String[] args){
        Childs ch=new Childs();
       ch.display();

    }
}
