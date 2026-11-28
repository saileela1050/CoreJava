package com.java.core.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementsIterator {

    public static void main(String[] args){

        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(60);
        //System.out.println(numbers);

        Iterator<Integer> iterator= numbers.iterator();
        while(iterator.hasNext()){
            int number= iterator.next();

            if(number==30){
                iterator.remove();
                System.out.println("no matching values");
            }
        }
   System.out.println(numbers);
    }
}
