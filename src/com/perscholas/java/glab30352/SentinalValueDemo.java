package com.perscholas.java.glab30352;

import java.util.Scanner;

public class SentinalValueDemo {
    public static void runTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum of the entered value is: " + sum);
    }
}