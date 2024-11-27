package com.perscholas.java.glab30331;

public class findString {
    public static void runTask() {

        String str1 = "Java is fun";
        int result;

        result = str1.indexOf("s");
        System.out.println(result);

        result = str1.lastIndexOf("J");
        System.out.println(result);

        result = str1.lastIndexOf("a");
        System.out.println(result);

        result = str1.lastIndexOf("j");
        System.out.println(result);

        result = str1.lastIndexOf("ava");
        System.out.println(result);

        result = str1.lastIndexOf("java");
        System.out.println(result);
    }
}