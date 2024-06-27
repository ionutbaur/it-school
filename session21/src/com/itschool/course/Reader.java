package com.itschool.course;

@FunctionalInterface
public interface Reader {

    int a = 7;

    String read(int a, int b);

    default void readLouder() {
        System.out.println("Read louder....");
    }

    //int count();
}
