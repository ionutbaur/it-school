package com.itschool.recap.oop.ex8;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating.");
    }
}
