package com.perscholas.java.glab30352;

import java.util.Scanner;

public class GuessTheNumber {
    public static void runTask() {
        int number = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a magic number between 0 and 100");
        int guess = -1;
        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your number is too high");
            else
                System.out.println("Your number is too low");
        }
    }
}