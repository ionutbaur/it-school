package com.itschool.course;

import java.util.Scanner;

public class WrapperClasses {

    private String instanceVar;
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Boolean bool = boolMethod();
        Boolean secondBool = new Boolean(true);

        int a = Math.max(2, 7);

        System.out.println(secondBool);

        String number = "20";
        int transformedNumber = Integer.valueOf(number);
        System.out.println(transformedNumber);

        int addition = sum(2, 5);
    }

    private static Boolean boolMethod() {
        System.out.println("aaaaa");
        return null;
    }

    private static int sum(int a, int b) {
        return  a + b;
    }
}