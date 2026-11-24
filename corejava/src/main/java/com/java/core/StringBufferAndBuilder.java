package com.java.core;

public class StringBufferAndBuilder {

    public static void main(String[] args){

        StringBuffer sb=new StringBuffer("Program");
        //default 16
        int y=sb.capacity();
        System.out.println(y);
        sb.append("core");
        System.out.println(sb);
       //sb.length();
        sb.insert(4,"co");
        System.out.println(sb);

        sb.replace(0,4,"spring");
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

       int g= sb.length();
        System.out.println(g);



    }
}
