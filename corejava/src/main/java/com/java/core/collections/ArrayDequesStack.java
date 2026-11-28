package com.java.core.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequesStack {

    public static void main(String[] args){


        Deque<Integer> stack=new ArrayDeque<>();
       // stack.add(10);
          stack.push(10);
          stack.push(20);
          stack.push(30);
        System.out.println(stack);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
