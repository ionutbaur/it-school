package com.itschool.recap.oop.ex8;

public class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck started.");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerating.");
    }
}
