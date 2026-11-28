package com.java.core.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMultipleThreads {

    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<Integer, String> employees = new ConcurrentHashMap<>();
        Runnable task1=()->{
            employees.put(4,"ops");
        };

        Runnable task2=()->{
            employees.put(5,"opiu");
        };

        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        // employees.put(null, "zow");
        System.out.println(employees);
    }
}
