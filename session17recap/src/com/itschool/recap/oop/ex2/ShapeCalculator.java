package com.itschool.recap.oop.ex2;

public record ShapeCalculator(Shape shape) {

    // Method to calculate the area of the shape
    public double calculateArea() {
        return shape.length() * shape.width();
    }

    // Method to calculate the perimeter of the shape
    public double calculatePerimeter() {
        return (shape.length() + shape.width()) * 2;
    }
}
