package com.itschool.course;

public non-sealed class ModernCar extends Car implements MyInterface4, MyInterface3 {
    @Override
    protected void startEngine() {
        System.out.println("Keyless go!");
    }

    @Override
    protected void shiftGears() {

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
