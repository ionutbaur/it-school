package com.itschool.course;

public final class OldCar extends Car {
    public OldCar() {
    }

    public OldCar(int year) {
        super(year);
    }

    @Override
    protected void startEngine() {
        System.out.println("Ignition on");
    }

    @Override
    protected void shiftGears() {
        System.out.println("I have a manual shifter");
    }

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }

    @Override
    public void printFromInterface2() {

    }
}
