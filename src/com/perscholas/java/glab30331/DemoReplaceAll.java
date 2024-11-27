package com.perscholas.java.glab30331;

public class DemoReplaceAll {
    public static void runTask() {

        String str1 = "Java123is456fun";
        String regex = "\\d+";

        System.out.println(str1.replaceAll(regex, " "));
    }
}