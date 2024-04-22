package com.itschool.course;

public class MyImpl implements D {

    public static void main(String[] args) {
        D d = new MyImpl();
        d.print();
        D.printStatic();
    }
}
