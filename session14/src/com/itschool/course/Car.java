package com.itschool.course;

public abstract sealed class Car implements MyInterface permits OldCar, ModernCar {

    public int year;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public void run() {
        System.out.println(year);
        System.out.println("Preparing to run the car");
        startEngine();
        shiftGears();
    }

    protected abstract void startEngine();

    protected abstract void shiftGears();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
