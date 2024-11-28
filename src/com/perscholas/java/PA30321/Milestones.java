package com.perscholas.java.PA30321;

public class Milestones {
    public static void runTask() {

        int totalMilestones = 20;
        int completedMilestones = 5;
        int milestonesPerPhase = totalMilestones / completedMilestones;

        System.out.println("Milestones per Phase: " + milestonesPerPhase);

        double totalMilestonesDecimal = 20.0;
        double resultDecimal = totalMilestonesDecimal / completedMilestones;

        System.out.println("Milestones per Phase (Decimal): " + resultDecimal);
    }
}