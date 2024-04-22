package com.itschool.course;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class Course9 {

    public static void main(String[] args) {
        //localDateDemo();
        //localDateTimeDemo();
        //dateDemo();
        //randomDemo();
        mathDemo();
    }

    private static void localDateDemo() {
        LocalDate localDate = LocalDate.now();
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);

        LocalDate dateOfBirth = LocalDate.of(1991, 10, 11);
        System.out.println(dateOfBirth);
        System.out.println(LocalDate.now());

        LocalDate dateOfBirthWithMonth = LocalDate.of(2000, Month.NOVEMBER, 4);
        System.out.println(dateOfBirthWithMonth);
        System.out.println(dateOfBirth.getDayOfWeek());
    }

    private static void localDateTimeDemo() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before formatting");
        System.out.println(localDateTime);

        System.out.println("After formatting");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM/yy HH:mm");
        System.out.println(localDateTime.format(formatter));
    }

    private static void dateDemo() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
    }

    private static void randomDemo() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(-5,4));
        System.out.println(random.nextDouble());
    }

    private static void mathDemo() {
        int absoluteValue = Math.abs(-7);
        System.out.println(absoluteValue);
        System.out.println(Math.max(1, 8));
    }
}
