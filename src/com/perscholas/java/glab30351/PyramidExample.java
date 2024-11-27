package com.perscholas.java.glab30351;

public class PyramidExample {
    public static void runTask() {

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}