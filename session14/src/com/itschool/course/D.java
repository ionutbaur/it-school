package com.itschool.course;

public interface D extends B, C {
    static void printStatic() {
        System.out.println("Static method from D");
    }

    @Override
    default void print() {
        B.super.print();
        writeSmth();
    }

    private String writeSmth() {
        return "ceva";
    }
}
