package com.perscholas.java.OOP;

public class Main {
    public static void main(String[] args) {

        Auto obj1 = new Auto();
        obj1.setBrand("Mustang");
        obj1.setSpeed(150);

        System.out.println(obj1.getBrand());
        System.out.println(obj1.getSpeed());

        Auto obj2 = new Auto("Jeep", 100);

        System.out.println(obj2.toString());

        obj2.accelerate();

        obj2.setSpeed(200);
        obj2.accelerate();

    }
}
