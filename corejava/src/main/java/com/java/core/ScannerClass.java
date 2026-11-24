package com.java.core;
import java.util.Scanner;

// input and ouput example using scanner class

public class ScannerClass {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name:");
        String name=sc.nextLine();

        System.out.print("Enter age:");
        int age=sc.nextInt();

        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        sc.close();

    }
}
