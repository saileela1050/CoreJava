package com.java.core;

class Animal{
    void sound(){
        System.out.println("Animal");
    }
}
class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Cat meow");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
public class Overriding {

    public static void main(String[] args){

        Animal animal;
        animal=new Cat();
        animal.sound();

        animal=new Dog();
        animal.sound();

    }
}
