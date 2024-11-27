package com.perscholas.java.glab30331;

import java.util.Arrays;

public class SplitMethod {
    public static void runTask() {

        String vowels = "a::b::c::d:e";
        String[] result = vowels.split("::");

        System.out.println("result = " + Arrays.toString(result));
    }
}