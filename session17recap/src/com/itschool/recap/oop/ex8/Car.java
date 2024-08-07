package com.itschool.recap.oop.ex8;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating.");
    }
}
