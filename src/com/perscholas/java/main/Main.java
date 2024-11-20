package com.perscholas.java.main;

import com.perscholas.java.glab30321.GLAB30321ASMT;
import com.perscholas.java.glab30322.GLAB30322ASMT;
import com.perscholas.java.glab30331.GLAB30331ASMT;
import com.perscholas.java.java_basics.JavaBasicsClass;


public class Main {
    public static void main(String[] args) {

        GLAB30321ASMT assignment1 = new GLAB30321ASMT();
        assignment1.runAllAssignments();

        GLAB30322ASMT assignment2 = new GLAB30322ASMT();
        assignment2.runAllAssignments();

        GLAB30331ASMT assignment3 = new GLAB30331ASMT();
        assignment3.runAllAssignments();

        JavaBasicsClass javaBasicsClass = new JavaBasicsClass();
        javaBasicsClass.pajava01();

    }
}
