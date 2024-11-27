package com.perscholas.java.glab30331;

public class concatDemo {
    public static void runTask() {

        String str1 = "Learn ";
        String str2 = "Java";

        System.out.println(str1.concat(str2));
        System.out.println(str2.concat(str1));

        String s3 = "hello";
        String s4 = "Learners";
        String s5 = s3 + s4;

        String message = "Welcome " + "to " + "Java";
        System.out.println("Exercise 8: The First character in the message is " + message.charAt(0));

        String s2 = "Chapter " + 2;
        String s1 = "Supplement " + 'B';

        System.out.println(message);
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s2);
    }
}