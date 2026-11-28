package com.java.core.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeques {

    public static void main(String[] args){

        Deque<Integer> deque=new ArrayDeque<>();
        deque.offerLast(10);
        deque.offerLast(20);
        deque.offerFirst(20);

        //deque.offerFirst(null);
        System.out.println(deque);
        deque.push(80);
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque);
    }
}
