package com.itschool.homework;

import java.util.Scanner;
public class Challenge5 {

    public static void main(String[] args) {
//
//        int x = 10;
//        int y = 11;
//        //assignment and compound assignment operators
//
//        System.out.println(x*=5);
//        System.out.println(x%=3);
//        System.out.println(y%=3);
//        System.out.println(x+=11);
//        System.out.println(x-=1);
//        System.out.println(x/=2);

        Scanner input = new Scanner(System.in);

        int price = 10;
        int age = 56;
        double payAmount = 0;

        if(age >+ 60){

            payAmount = price - price * 5 / 100;

        } else if(age >= 55){

            payAmount = price - price * 10 / 100;
        }

        System.out.println("Final price after discount is " + payAmount + "$");
    }
}
