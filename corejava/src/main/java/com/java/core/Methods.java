package com.java.core;

public class Methods {

static void greet(){
    System.out.println("heelo");
}

static int add(int a,int b){
    return a+b;
}

static int add(int a,int c,int d){
    return a+c+1;
}

void display(){
    System.out.println("Instance method");
}

static void displays(){
    System.out.println("Static methods");
}
int age=25;
static void greets(){
    Methods meth=new Methods();
    System.out.println(meth.age);
}
public static void main(String[] args){

    greet();
    System.out.println(add(10,90));
    System.out.println(add(20,30));
    Methods method=new Methods();
    method.display();

    Methods.displays();
    displays();
    greets();
}
}
