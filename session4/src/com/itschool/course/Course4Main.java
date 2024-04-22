package com.itschool.course;

public class Course4Main {

    public static void main(String[] args) {
        String firstName = "Ionutz";
        String lastName = "Baur";

        System.out.println(firstName + lastName);

        firstName += lastName;
        System.out.println(firstName);

        int number = -10;

        boolean trueVar = true;
        System.out.println("trueVar is: " + trueVar);

        System.out.println("negation of trueVar: " + !trueVar);

        boolean falseVar = false;
        System.out.println("falseVar is: " + falseVar);

        System.out.println("negation of falseVar: " + !falseVar);

        CourseDemo.charDemo();
    }

}
