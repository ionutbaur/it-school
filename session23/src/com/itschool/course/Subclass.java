package com.itschool.course;

public class Subclass extends SuperClass {

    @Override
    public void sayHello() {
        System.out.println("Hello from subclass");
    }

    void execute() {
        Runnable runnable = super::sayHello;
        runnable.run();
    }
}
