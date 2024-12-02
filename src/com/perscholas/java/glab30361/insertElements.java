package com.perscholas.java.glab30361;

import java.util.Scanner;

public class insertElements {
    public static void runTask() {

        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 Elements: ");
        for(i=0; i<10; i++)
            arr[i] = scan.nextInt();

        System.out.println("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;
        System.out.println("\nNow the new array is: ");
        for(i=0; i<11; i++)
            System.out.print(arr[i]+" ");
    }
}