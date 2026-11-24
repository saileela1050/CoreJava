package com.java.core;

public class Wrapper {
    private Integer employeeId;
    private Double employeeSalary;

    public static void main(String[] args){


        Wrapper wrap=new Wrapper();
        wrap.employeeId=109;
        wrap.employeeSalary=7888.89;

        System.out.println(wrap.employeeId);
        System.out.println(wrap.employeeSalary);

    }
}
