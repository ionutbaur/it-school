package com.itschool.homework;

import com.itschool.course.Course7Main;

public class Homework1 {

    public static void main(String[] args) {
        String a = "text";
        System.out.println(a.hashCode());
        System.out.println(Integer.toHexString(System.identityHashCode(a)));
        a = "aaaaaa";
        System.out.println(a.hashCode());
        System.out.println(Integer.toHexString(System.identityHashCode(a)));

        Integer integer = 4;
    }
}
