package com.java.core;

public class NestedIf {
    public static void main(String[] args) {

        int age = 8;
        boolean active = true;

        if (age >= 18) {
            if (active) {
                System.out.println("active");
            }else{
                System.out.println("not sactive");

            }
        }
        else{
            System.out.println("not satisfying");

        }
    }
}
