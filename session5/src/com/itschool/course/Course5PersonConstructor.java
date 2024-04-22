package com.itschool.course;

public class Course5PersonConstructor {

    public static void main(String[] args) {
        Person ionutz = new Person("Baur", 1917436575647L);
        System.out.println(ionutz.getLastName());
        System.out.println(ionutz.getCnp());

        String lastName = ionutz.getLastName();
        long cnp = ionutz.getCnp();

        System.out.println(lastName);
        System.out.println(cnp);

        System.out.println("printing entire obj");
        System.out.println(ionutz);

        System.out.println("printing from other method");

        printStuff(ionutz);
    }

    static void printStuff(Person aPerson) {
        System.out.println(aPerson.getCnp());
        System.out.println(aPerson.getLastName());
        System.out.println(aPerson.getAge());
    }
}
