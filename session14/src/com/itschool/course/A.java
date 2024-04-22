package com.itschool.course;

public interface A {

    default void print() {
        System.out.println("print from A");
    }
}
