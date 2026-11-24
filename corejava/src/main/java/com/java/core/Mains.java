package com.java.core;

 class ThisKeyword {

     int id;
     String name;

     ThisKeyword(int id, String name) {
         this.id = id;
         this.name = name;
     }

     void display() {
         System.out.println(id);
         System.out.println(name);
         System.out.println("show");
     }
     void show(){
         this.display();
     }
 }
 public class Mains {

public static void main(String[] args) {

  ThisKeyword the=new ThisKeyword(1,"fr");
  the.display();
}
}
