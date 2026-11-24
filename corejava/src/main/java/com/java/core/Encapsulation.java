package com.java.core;


class Employees{
    private int salary;

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid salary");
        }
    }
}
public class Encapsulation {

    public static void main(String[] args){

Employees emp=new Employees();
emp.setSalary(1000);
System.out.println(emp.getSalary());
emp.setSalary(-87);

    }
}
