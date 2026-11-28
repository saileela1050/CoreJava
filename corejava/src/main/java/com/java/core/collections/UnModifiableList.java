package com.java.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList {

    public static void main(String[] args){

        List<String> names=new ArrayList<>();
        names.add("java");
        names.add("spring");

        List<String> result= Collections.unmodifiableList(names);
        System.out.println(result);

      //  result.add("React"); UnModifiableList

    }
}
