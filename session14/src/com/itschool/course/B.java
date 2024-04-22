package com.itschool.course;

public interface B extends A {

    @Override
    default void print() {
        System.out.println("print from B");
    }
}
