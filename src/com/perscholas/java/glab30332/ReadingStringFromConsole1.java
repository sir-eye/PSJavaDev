package com.perscholas.java.glab30332;

import java.util.Scanner;

public class ReadingStringFromConsole1 {
    public static void runTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}