package com.perscholas.java.glab30322;


public class AutoPromoteTest {
    public static void main(String[] args) {

        System.out.println("****************************************************");
        System.out.println("\n");
        System.out.println("Auto Promote Test\n");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("result = " + result);
        System.out.println("\n");
        System.out.println("****************************************************");
    }
}

