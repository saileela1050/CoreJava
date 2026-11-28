package com.java.core.collections;

import java.util.*;

public class PriorityqueueClass {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
     //   queue.add(null);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(Collections.reverseOrder());
    }
}