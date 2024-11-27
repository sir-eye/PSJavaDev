package com.perscholas.java.glab30351;

public class NaturalNumberSum {
    public static void runTask() {

        int sum = 0;
        int n = 1000;

        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}