package com.itschool.recap.oop.ex2;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("rectangle", 10, 6.8);
        ShapeCalculator shapeCalculator = new ShapeCalculator(shape);
        double area = shapeCalculator.calculateArea();
        double perimeter = shapeCalculator.calculatePerimeter();

        System.out.println("Area of shape " + shape.shapeName() + " is: " + area);
        System.out.println("Perimeter of shape " + shape.shapeName() + " is: " + perimeter);
    }
}
