package com.itschool.course;

public class Course5PersonDemo {

    public static void main(String[] args) {
        Person ionutz = new Person();
        Person maria = new Person();
        Person laura = new Person();

        System.out.println(ionutz.getLastName());

        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

        ionutz.setFirstName("Ionutz");
        ionutz.setAge(32);
        ionutz.setCnp(1913726437264734636L);

        System.out.println("Results after setting properties");
        System.out.println(ionutz.getFirstName());

        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());

        String ionutzFirstName = ionutz.getFirstName();
        System.out.println("Person's first name is: " + ionutzFirstName);
    }
}
