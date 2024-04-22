package com.itschool.course;

public class MyConcreteClass implements MyInterface, MyInterface4 {
    @Override
    public void print() {
        System.out.println("Printing from my impl");
    }

    @Override
    public void display() {

    }

    @Override
    public void printFromInterface2() {
        System.out.println("print of interface2");
    }

    @Override
    public void defaultMethod() {
        System.out.println("my custom impl");
    }
}
