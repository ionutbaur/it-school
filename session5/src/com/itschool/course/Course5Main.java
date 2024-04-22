package com.itschool.course;

import java.util.Scanner;

public class Course5Main {

    public static void main(String[] args) {
         /*
         & - and
         && - and

         | - or
         || - or
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert boolean: ");
        String a = scanner.nextLine();;

        boolean trueVar = true;
        boolean falseVar = false;
        Boolean var = null;

        boolean result = trueVar || falseVar || var;

        System.out.println(result);

        System.out.println(trueVar | falseVar | var);
    }
}
