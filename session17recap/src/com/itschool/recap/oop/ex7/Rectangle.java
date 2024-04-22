package com.itschool.recap.oop.ex7;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        super("rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
