package com.itschool.course;

public interface MyInterface extends MyInterface2, MyInterface3 {

    int myVar = 0;
    String BANK_NAME = "BRD";

    void print();

    void display();

     default void defaultMethod() {
        System.out.println("Hello from default method!");
        method();
    }

    private void method() {

    }
}
