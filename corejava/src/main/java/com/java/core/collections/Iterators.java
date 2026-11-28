package com.java.core.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

    public static void main(String[] args){

        List<String> names=new ArrayList<>();
        names.add("sai");
        names.add("leela");
        names.add("lion");
        names.add(null);
        System.out.println(names);

        Iterator<String> iterator=names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }

    }
}
