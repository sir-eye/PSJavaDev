package com.perscholas.java.java_basics;

public class JavaBasicsClass {
    public void pajava01() {
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************\n");
        System.out.println("Exercise 1: Adding two integers");

        int completedTasks = 25;
        int pendingTasks = 10;
        int totalTasks = completedTasks + pendingTasks;
        System.out.println("Total tasks: " + totalTasks);
        System.out.println("\n");

        System.out.println("****************************************************\n");
        System.out.println("Exercise 2: Adding two doubles");
        double budgetAllocated = 150000.75;
        double budgetSpent = 5000.25;
        double totalBudget = budgetAllocated + budgetSpent;
        System.out.println("Total budget: " + totalBudget);
        System.out.println("\n");

        System.out.println("****************************************************\n");
        System.out.println("Exercise 3: Adding an integer and a double");
        int teamMembers = 8;
        double projectDuration = 12.5; //in weeks
        double totalEffort = teamMembers + projectDuration;
        System.out.println("Total effort: " + totalEffort);
        System.out.println("\n");

        System.out.println("****************************************************\n");
        System.out.println("Exercise 4: Dividing two integers");
        int totalMilestones = 20;
        int completedMilestones = 5;
        int milestonesPerPhase = totalMilestones / completedMilestones;
        System.out.println("Milestones per Phase: " + milestonesPerPhase);
        System.out.println("\n");
        System.out.println("****************************************************\n");
        System.out.println("Now changing the Milestones to a decimal");
        double totalMilestonesDecimal = 20.0;
        double resultDecimal = totalMilestonesDecimal / completedMilestones;
        System.out.println("Milestones per Phase (Decimal)" + resultDecimal);
        System.out.println("\n");

        System.out.println("****************************************************\n");
        System.out.println("Exercise 5: Dividing two doubles and casting to integer");
        double totalBudgetProject = 100000.50;
        double budgetPerPhase = 20000.25;
        double budgetDivision = totalBudgetProject / budgetPerPhase;
        System.out.println("Budget per Phase: " + budgetPerPhase);

        int budgetDivisionInt = (int) budgetDivision;
        System.out.println("Budget division (Casted to Int): " + budgetDivisionInt);

        System.out.println("\n");
        System.out.println("****************************************************\n");
        System.out.println("Exercise 6: Division and casting");
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("Quotient without Casting:" + q);

        q = (double) y / x;
        System.out.println("Quotient with Casting:" + q);

        System.out.println("\n");
        System.out.println("**************************************************\n");
        System.out.println("Exercise 7: Using a named constant");
        final double MAX_BUDGET = 50000.00;
        double remainingBudget = MAX_BUDGET / budgetSpent;
        System.out.println("Remaining Budget: " + remainingBudget);

        System.out.println("\n");
        System.out.println("**************************************************\n");
        System.out.println("Exercise 8: Cafe product prices and sales calculation");
        double coffeePrice = 3.50;
        double cappuccinoPrice = 4.75;
        double greenTeaPrice = 2.25;

        int coffeeOrder = 3;
        int cappuccinoOrder = 4;
        int greenTeaOrder = 2;

        double subTotal = (coffeeOrder * coffeePrice) + (cappuccinoOrder *  cappuccinoPrice) + (greenTeaOrder * greenTeaPrice);
        final double SALES_TAX = 0.08;
        double totalSale = subTotal + (subTotal * SALES_TAX);

        System.out.printf("Subtotal: $%.2f%n", subTotal);
        System.out.printf("Total Sale (with tax): $%.2f%n", totalSale);
        System.out.println("\n");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
    }
}
