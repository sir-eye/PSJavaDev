package com.perscholas.java.PA30321;

public class TotalBudget {
    public static void runTask() {

        double budgetAllocated = 15000.75;
        double budgetSpent = 5000.25;
        double totalBudget = budgetAllocated + budgetSpent;

        System.out.println("Total Budget: " + totalBudget);

        final double MAX_BUDGET = 50000.00;
        double remainingBudget = MAX_BUDGET - budgetSpent;
        System.out.println("Remaining Budget: " + remainingBudget);
    }
}