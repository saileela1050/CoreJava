package com.java.core;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter a name:");
        String name=br.readLine();

        System.out.print("Enter age:");
        int age=Integer.parseInt(br.readLine());

        System.out.println("Name:" +name);
        System.out.println("Age:"+age);

    }
}
