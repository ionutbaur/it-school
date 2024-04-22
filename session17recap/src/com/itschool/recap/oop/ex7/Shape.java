package com.itschool.recap.oop.ex7;

public abstract class Shape {

    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    protected abstract double area();

    public String getName() {
        return name;
    }
}
