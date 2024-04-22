package com.itschool.recap.oop.ex7;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super("triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    protected double area() {
        return (base * height) / 2;
    }
}
