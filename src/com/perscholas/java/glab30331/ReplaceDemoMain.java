package com.perscholas.java.glab30331;

public class ReplaceDemoMain {
    public static void runTask() {

        String str1 = "abc cba";

        System.out.println(str1.replace('a','z'));

        System.out.println("Lava".replace('L','J'));

        System.out.println("Hello".replace('4','J'));

        System.out.println(str1.replace("C++", "Java"));

        System.out.println("Java".replace("C++", "C"));
    }
}