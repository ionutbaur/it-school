package com.itschool.homework;

public class Concat {
        public static void main(String[] args) {

            String text1 = "Ana are mere.";
            //              0123456789123
            String text2 = "Si Ionut are mere.";
            String replace = text1.replace ("."," ");

            System.out.println(replace + text2.toLowerCase());

            String replace2 = text2.replace ("ionut", "Ionut");

            System.out.println(replace+ text2.toLowerCase());

            String a = text1.substring(0,12);
            System.out.println(a);

            System.out.println(a + " " + text2.toLowerCase());

        }
    }

