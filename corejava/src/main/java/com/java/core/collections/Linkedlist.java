package com.java.core.collections;

import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args){

        LinkedList<String> names=new LinkedList<>();
        names.add("java");
        names.add("spring");
        names.add("sql");
        names.add("microservices");
        System.out.println(names);
        names.addFirst("sai");
        names.addLast("leela");
        System.out.println(names);

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        names.removeFirst();
        names.removeLast();
        System.out.println(names);
    }
}
