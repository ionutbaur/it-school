package com.itschool.course;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("ionutz", 19136453543L);
        Person person2 = new Person("ionutz", 19136453543L);
        Person person3 = new Person("gabriel", 32);
        //System.out.println(person1.hashCode());

        System.out.println(person1.equals(person2));

        Set<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        Set<String> set;
        Set<Integer> set1;

        System.out.println(personSet);

    }

}
