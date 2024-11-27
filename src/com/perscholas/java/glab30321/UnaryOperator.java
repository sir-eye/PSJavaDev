package com.perscholas.java.glab30321;

public class UnaryOperator {
    public static void runTask() {
        int sum = +1;

        System.out.println(sum);

        sum--;
        System.out.println(sum);

        sum++;
        System.out.println(sum);

        sum = -sum;
        System.out.println(sum);

        boolean result = false;
        System.out.println(result);
        System.out.println(!result);
    }
}