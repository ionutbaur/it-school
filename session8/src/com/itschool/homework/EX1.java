package com.itschool.homework;

public class EX1 {
    public static void main(String[] args) {
        String a = "What a beautiful day!";
        StringBuilder stringBuilder = new StringBuilder(a);
        System.out.println("The reversed string is: " + stringBuilder.reverse());
    }
}
