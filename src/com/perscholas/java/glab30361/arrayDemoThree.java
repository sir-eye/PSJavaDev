package com.perscholas.java.glab30361;

public class arrayDemoThree {
    public static void runTask() {
        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int sum = 0;
        Double average;

        for (int number: numbers) {
            sum += number;
        }

        int arrayLength = numbers.length;
        average = (double)sum/arrayLength;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}