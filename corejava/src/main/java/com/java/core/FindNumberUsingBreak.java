package com.java.core;

public class FindNumberUsingBreak {

    public static void main(String[] args) {

        int number[] = {10, 20, 90, 100};

        for (int numbers : number) {
            if (numbers == 90) {
                System.out.println(numbers);
                break;
            }

        }
    }
}

