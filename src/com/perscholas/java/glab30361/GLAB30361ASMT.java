package com.perscholas.java.glab30361;

import com.perscholas.java.glab30361.arrayDemoOne;
import com.perscholas.java.glab30361.arrayDemoTwo;
import com.perscholas.java.glab30361.EnhancedForLoop;
import com.perscholas.java.glab30361.arrayDemoThree;
import com.perscholas.java.glab30361.MeanSDArray;
import com.perscholas.java.glab30361.insertElements;

public class GLAB30361ASMT {
    public void runAllAssignments() {
        System.out.println("\n******************************************");
        System.out.println("GUIDED LAB 303.6.1 - Array");
        System.out.println("******************************************\n");

        System.out.println("\n\n\n>>Example 1: Access Array Elements");
        arrayDemoOne.runTask();

        System.out.println("\n\n\n>>Example 2: Using for Loop");
        arrayDemoTwo.runTask();

        System.out.println("\n\n\n>>Example 3: Iterating Over an Array using EnhancedForLoop");
        EnhancedForLoop.runTask();

        System.out.println("\n\n\n>>Example 4: Compute the Sum and Average of Array Elements");
        arrayDemoThree.runTask();

        System.out.println("\n\n\n>>Example 5: Mean and Standard Deviation");
        MeanSDArray.runTask();

        System.out.println("\n\n\n>>Example 6: Insert an Element at the end of an Array in Java");
        insertElements.runTask();

        System.out.println("\n******************************************");
        System.out.println("******************************************\n");
    }
}