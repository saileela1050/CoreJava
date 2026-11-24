package com.java.core;

import java.util.Locale;

public class Strings {

    public static void main(String[] args){
        String s1="Java";
        String s2="Java";
      // String s3= s1.concat( "pro");
        String s3="Pro";
       String s4=s1+" "+s3;
 System.out.println( s4);
 System.out.println(s1.length());
 System.out.println(s1.charAt(0));
 System.out.println(s3.charAt(2));
 String s5=s1.toUpperCase();
 System.out.println(s5);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String str=new String("Oops");
        String str1=new String("Oops");

System.out.println(str==str1);
System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));


String status=new String("SUCCESS");
if(status.equals("SUCCESS")){
    System.out.println("Payment successfully");
}
else{
    System.out.println("defaul");
}


System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        String dr="Jackson fr";
        System.out.println(dr.trim());
        System.out.println(s1.contains("Java"));
        System.out.println(dr.startsWith("J"));
        System.out.println(dr.endsWith("r"));
        System.out.println(dr.substring(7));
        System.out.println(dr.substring(0,7));
        System.out.println(dr.replace("Jackson","Janny"));
       System.out.println(dr.indexOf("f"));
        System.out.println(dr.lastIndexOf("f"));

        String data="java,pythn,sql";
        String[] lang=data.split(",");
        for(String languages: lang){
            System.out.println(languages);
        }


        String datas="";
        String dat=" ";
        System.out.println(datas.isEmpty());
       // System.out.println(datas.isBlank());

        System.out.println(dat.isEmpty());
        System.out.println(dat.isBlank());





    }
}
