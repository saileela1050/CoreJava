package com.java.core.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BackwardTraversal {

    public static void main(String[] args){

        List<String> names=new ArrayList<>();

        names.add("lion");
        names.add("king");
        names.add("cow");
        names.add("cat");

      //  System.out.println(names);

        ListIterator<String> iterator= names.listIterator();
        System.out.println("Forward traversal:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("backward traversal:");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
