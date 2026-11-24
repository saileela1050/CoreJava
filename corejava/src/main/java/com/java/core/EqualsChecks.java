package com.java.core;

public class EqualsChecks {

    public static void main(String[] args){

        String status="SUCCESS";
        if(status.equals("SUCCESS")){
            System.out.println("Completed");
        } else if (status.equals("PENDING")) {
            System.out.println("pending");

        }else{
            System.out.println("unknown");

        }
    }
}
