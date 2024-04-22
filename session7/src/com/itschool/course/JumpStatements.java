package com.itschool.course;

public class JumpStatements {

    private static final int LUCKY_NUMBER = 3;

    public static void main(String[] args) {
        //breakStatement();
        continueStatement();
    }

    private static void breakStatement() {
        int[] array = {1, 2, 3, 4, 5};
        for (int element : array) {
            System.out.println("At start Element is: " + element);
            if (element == LUCKY_NUMBER) {
                System.out.println("Found my lucky number! I don't care about the rest!");
                break;
            }
            System.out.println("At end Element is: " + element);
        }

        System.out.println("==========program end===========");
    }

    private static void continueStatement() {
        int[] array = {1, 2, 3, 4, 5};
        for (int element : array) {
            System.out.println("At start Element is: " + element);
            if (element == LUCKY_NUMBER) {
                System.out.println("Found my lucky number! I don't care about the rest!");
                continue;
            }
            System.out.println("At end Element is: " + element);
        }

        System.out.println("==========program end===========");
    }
}
