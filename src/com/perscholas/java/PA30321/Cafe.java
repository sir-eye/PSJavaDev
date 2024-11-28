package com.perscholas.java.PA30321;

public class Cafe {
    public static void runTask() {

        double coffeePrice = 3.50;
        double cappuccinoPrice = 4.75;
        double greenTeaPrice = 2.25;

        int coffeeOrder = 3;
        int cappuccinoOrder = 4;
        int greenTeaOrder = 2;

        double subtotal = (coffeeOrder * coffeePrice) + (cappuccinoOrder * cappuccinoPrice) + (greenTeaOrder * greenTeaPrice);
        final double SALES_TAX = 0.08;
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Total Sale (with Tax): $%.2f%n", totalSale);
    }
}