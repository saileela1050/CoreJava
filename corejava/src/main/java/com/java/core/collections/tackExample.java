package com.java.core.collections;

import java.util.Stack;

public class tackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(70);

        System.out.println(stack);


        stack.push(80);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.elements());

    }
}
