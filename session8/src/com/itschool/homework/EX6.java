package com.itschool.homework;

public class EX6 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("The sun is up");
        stringBuilder.delete(4, 7);
        System.out.println("Updated string: " + stringBuilder.toString());
    }
}
