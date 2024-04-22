package com.itschool.course;

public interface C extends A {

    @Override
    default void print() {
        System.out.println("print from C");
    }
}
