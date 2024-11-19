package com.perscholas.java.glab30321;

import com.perscholas.java.glab30321.ArithmeticOperatorsDemo;
import com.perscholas.java.glab30321.AssignmentOperatorsDemo;
import com.perscholas.java.glab30321.BitwiseOperatorsDemo;
import com.perscholas.java.glab30321.LogicalOperatorsDemo;
import com.perscholas.java.glab30321.RelationalOperatorsDemo;
import com.perscholas.java.glab30321.TernaryOperatorDemo;
import com.perscholas.java.glab30321.UnaryOperator;

public class GLAB30321ASMT {
    public void runAllAssignments() {

        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("GUIDED LAB 303.2.1 - Core Java: Operators\n");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        // Create objects of each class and call their methods to run the assignments
        ArithmeticOperatorsDemo arithmeticDemo = new ArithmeticOperatorsDemo();
        arithmeticDemo.main(null); // Call the main method or a specific method

        AssignmentOperatorsDemo assignmentDemo = new AssignmentOperatorsDemo();
        assignmentDemo.main(null);

        BitwiseOperatorsDemo bitwiseDemo = new BitwiseOperatorsDemo();
        bitwiseDemo.main(null);

        LogicalOperatorsDemo logicalDemo = new LogicalOperatorsDemo();
        logicalDemo.main(null);

        RelationalOperatorsDemo relationalDemo = new RelationalOperatorsDemo();
        relationalDemo.main(null);

        TernaryOperatorDemo ternaryDemo = new TernaryOperatorDemo();
        ternaryDemo.main(null);

        UnaryOperator unaryDemo = new UnaryOperator();
        unaryDemo.main(null);
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
    }
}
