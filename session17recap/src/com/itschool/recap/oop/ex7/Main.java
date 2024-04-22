package com.itschool.recap.oop.ex7;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape triangle = new Triangle(4, 6);
        Shape circle = new Circle(2.5);
        // Create an array of Shape objects
        Shape[] shapes = {rectangle, triangle, circle};

        // Iterate through the array to calculate and print the area of each shape
        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getName() + ": " + shape.area());
        }
    }
}
