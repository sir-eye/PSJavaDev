package com.perscholas.java.glab30321;

public class AssignmentOperatorsDemo {
    public static void main(String args[]) {

        int j, k;
        j = 10;
        j = 5;
        k = j;
        System.out.println("**************************");
        System.out.println("\n");
        System.out.println("Assignment Operators Demo\n");
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        k = j = 10;

        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
        System.out.println("\n");
        System.out.println("**************************");
    }
}

