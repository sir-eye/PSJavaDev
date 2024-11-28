package com.perscholas.java.PA30321;

import com.perscholas.java.PA30321.ProjectTasks;
import com.perscholas.java.PA30321.TotalBudget;
import com.perscholas.java.PA30321.TotalEffort;
import com.perscholas.java.PA30321.Milestones;
import com.perscholas.java.PA30321.BudgetPerPhase;
import com.perscholas.java.PA30321.ConstantCasting;
import com.perscholas.java.PA30321.Cafe;

public class pa30321ASMT {
    public void runAllAssignments() {

        System.out.println("\n******************************************");
        System.out.println("PRACTICE ASSIGNMENT 303.2.1 - Core Java -Variables");
        System.out.println("******************************************\n");

        System.out.println("\n\n\n>>Example 1: Adding two int variables");
        ProjectTasks.runTask();

        System.out.println("\n\n\n>>Example 2 & 6: Adding two double variables and final double");
        TotalBudget.runTask();

        System.out.println("\n\n\n>>Example 3: Adding an int and a double");
        TotalEffort.runTask();

        System.out.println("\n\n\n>>Example 4: Dividing two ints");
        Milestones.runTask();

        System.out.println("\n\n\n>>Example 5: Casting");
        BudgetPerPhase.runTask();

        System.out.println("\n\n\n>>Example 7: Constant");
        ConstantCasting.runTask();

        System.out.println("\n\n\n>>Example 8: Cafe products");
        Cafe.runTask();

        System.out.println("\n******************************************");
        System.out.println("******************************************\n");
    }
}