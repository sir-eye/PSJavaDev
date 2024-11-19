package com.perscholas.java.glab30321;

public class UnaryOperator {
    public static void main(String[] args)
    {
        int sum = +1;
        System.out.println("****************************************************");
        System.out.println("\n");
        System.out.println("Unary Operator Demo\n");
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
        System.out.println("\n");
        System.out.println("****************************************************");
    }
}