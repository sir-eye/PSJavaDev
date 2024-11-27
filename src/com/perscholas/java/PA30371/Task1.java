package com.perscholas.java.PA30371;

/*
Task 1:
Write a program that creates an array of integers with a length of 3.
Assign the values 1, 2, and 3 to the indexes.
Print out each array element.
 */

public class Task1 {

    public static void runTask(){
        System.out.println("Task 1:\n>Write a program that creates an array of integers with a length of 3.\n>Assign the values 1, 2, and 3 to the indexes.\n>Print out each array element.\n");
        System.out.println("***************Array of Integers***************\n");

        int[] numbers = {1,2,3};
        for (int num : numbers) {

            System.out.println(num);
        }
    }
}
