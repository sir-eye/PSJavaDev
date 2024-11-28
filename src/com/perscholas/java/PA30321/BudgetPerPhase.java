package com.perscholas.java.PA30321;

public class BudgetPerPhase {
    public static void runTask() {

        double totalBudgetProject = 100000.50;
        double budgetPerPhase = 20000.25;
        double budgetDivision = totalBudgetProject / budgetPerPhase;

        System.out.println("Budget per Phase: " + budgetDivision);

        int budgetDivisionInt = (int) budgetDivision;

        System.out.println("Budget per Phase (Casted to Int): " + budgetDivisionInt);
    }
}