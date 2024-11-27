package com.perscholas.java.glab30321;

import com.perscholas.java.glab30321.ArithmeticOperatorsDemo;
import com.perscholas.java.glab30321.AssignmentOperatorsDemo;
import com.perscholas.java.glab30321.BitwiseOperatorsDemo;
import com.perscholas.java.glab30321.LogicalOperatorsDemo;
import com.perscholas.java.glab30321.RelationalOperatorsDemo;
import com.perscholas.java.glab30321.TernaryOperatorDemo;
import com.perscholas.java.glab30321.UnaryOperator;
import com.perscholas.java.glab30351.LoopDemoOne;

public class GLAB30321ASMT {
    public void runAllAssignments() {

        System.out.println("\n\n\n******************************************");
        System.out.println("GUIDED LAB 303.2.1 - Core Java: Operators");
        System.out.println("******************************************\n");

        System.out.println("\n\n\n>>Arithmetic Operators Demo");
        ArithmeticOperatorsDemo.runTask();

        System.out.println("\n\n\n>>Assignment Operators Demo");
        AssignmentOperatorsDemo.runTask();

        System.out.println("\n\n\n>>Bitwise Operators Demo");
        BitwiseOperatorsDemo.runTask();

        System.out.println("\n\n\n>>Logical Operators Demo");
        LogicalOperatorsDemo.runTask();

        System.out.println("\n\n\n>>Relational Operators Demo");
        RelationalOperatorsDemo.runTask();

        System.out.println("\n\n\n>>Ternary Operators Demo");
        TernaryOperatorDemo.runTask();

        System.out.println("\n\n\n>>Unary Operators Demo");
        UnaryOperator.runTask();

        System.out.println("\n******************************************");
        System.out.println("******************************************\n");
    }
}
