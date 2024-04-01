package com.itschool.homework;

public class EX2 {

    public static void main(String[] args) {

        String a = "radar";
        StringBuilder stringBuilder = new StringBuilder(a);
        String reversedA = stringBuilder.reverse().toString();
        if (a.equals(reversedA)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is NOT a palindrome");
        }
    }
}
