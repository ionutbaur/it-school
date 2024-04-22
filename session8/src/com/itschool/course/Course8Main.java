package com.itschool.course;

public class Course8Main {

    private final String CONSTANT = "aaa";

    public static void main(String[] args) {
        /*Person ionutz = new Person(32, "baur");
        ionutz.getAge();
        ionutz.getName();

        ionutz = new Person(22, "Ionescu");*/

        Person person = new Person(32, "ionutz");
        System.out.println(person);

        System.out.println(person.getAge());
        System.out.println(person.getName());

        String text = "random text";
        System.out.println("Original text is: " + text);

        char charAt = text.charAt(2);
        System.out.println("charAt is: " + charAt);
        text.indexOf("m");

        String upperText = text.toUpperCase();
        System.out.println("Uppercase text: " + upperText);
    }
}
