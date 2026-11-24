package com.java.core;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 25;
        int age1 = 79;
        boolean isActive = true;

        // logical and
        if (age > 18 && age < 60) {
            System.out.println("Eligible");
        }
        //logical not
        if (age1 > 26 || age1 < 18) {
            System.out.println("Checks Eligible");
        }
        //logical not
      boolean result=!isActive;
        System.out.println(result);
    }
}
