package com.perscholas.java.glab30331;

public class ContainExample {
    public static void runTask() {

        String str1 = "Learn Java";
        Boolean result;

        result = str1.contains("Java");
        System.out.println(result);

        result = str1.contains("Python");
        System.out.println(result);

        result = str1.contains("");
        System.out.println(result);
    }
}