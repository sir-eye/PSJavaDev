package com.perscholas.java.glab30322;

import com.perscholas.java.glab30322.AutoPromoteTest;
import com.perscholas.java.glab30322.AutoTypeConversion;
import com.perscholas.java.glab30322.ExplicitTest;

public class GLAB30322ASMT {
    public void runAllAssignments() {

        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("GUIDED LAB 303.2.2 - Core Java: Type Casting\n");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");

        AutoTypeConversion autoTypeConversion = new AutoTypeConversion();
        autoTypeConversion.main(null);

        AutoPromoteTest autoPromoteTest = new AutoPromoteTest();
        autoPromoteTest.main(null);

        ExplicitTest explicitTest = new ExplicitTest();
        explicitTest.main(null);
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
    }
}
