package com.itschool.recap.oop.ex7;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    @Override
    protected double area() {
        return Math.PI * radius * radius;
    }
}
