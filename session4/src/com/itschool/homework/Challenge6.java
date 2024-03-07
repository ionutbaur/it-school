package com.itschool.homework;

public class Challenge6 {

    public static void main(String[] args) {

        int d = 5;
        int e = 4;

        System.out.println(d>e);
        System.out.println(d<e);
        System.out.println(d==e);

        if (d >= 0 && d <= 100) {
            System.out.println("d is in the range");
        }

        if (e >= -10 && e <= 3) {
            System.out.println("This is not supposed to be displayed");
        }

        if (d >= 2 && d <= 6) {
            System.out.println("d is in the range again");
        }
    }
}
