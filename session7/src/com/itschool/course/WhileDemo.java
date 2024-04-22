package com.itschool.course;

public class WhileDemo {

    public static void main(String[] args) {
        int number = 30;
        //for (number = 5 ; number < 10; number++)
        /*while (number < 10) {
            System.out.println("The number is: " + number);
            number++;
        }*/

        do {
            System.out.println("The number is from do-while: " + number);
            number ++;
        } while (number < 10);

        System.out.println("======end");
    }
}
