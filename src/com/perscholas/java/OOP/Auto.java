package com.perscholas.java.OOP;

import java.util.Objects;

public class Auto {
    private String brand;
    private int speed;


    public Auto(){}


    public Auto(String brand, int speed){
        this.brand = brand;
        this.speed = speed;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        speed = speed + 10;
        System.out.println("This " + brand + " is now going at " + speed + "MPH.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return speed == auto.speed && Objects.equals(brand, auto.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed);
    }
}
