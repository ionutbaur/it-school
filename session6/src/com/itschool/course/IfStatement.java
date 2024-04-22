package com.itschool.course;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number:");
        int number = scanner.nextInt();
        if (number < 5) {
            System.out.println("The number is < 5");
        } else if (number == 5) {
            System.out.println("The number is = 5");
        } else if (number < 10) {
            System.out.println("The number is > 5 and < 10");
        } else if (number > 10 && number <= 20) {
            System.out.println("The number is > 10 and <= 20");
        } else {
            System.out.println("The number is >= 20");
        }


    }
}
