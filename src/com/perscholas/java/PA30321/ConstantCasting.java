package com.perscholas.java.PA30321;

public class ConstantCasting {
    public static void runTask() {

        int x = 5;
        int y = 6;
        double q = y / x;

        System.out.println("Quotient without Casting: " + q);

        q = (double) y / x;

        System.out.println("Quotient with Casting: " + q);
    }
}