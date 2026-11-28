package com.java.core.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForwardTraversal {


    public static void main(String[] args){

        List<String> names=new ArrayList<>();
        names.add("sai");
        names.add("leela");
        names.add("king");
        names.add("camel");

        ListIterator<String> iterator=names.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        iterator.remove();
//        System.out.println(iterator.next());
    }
}
