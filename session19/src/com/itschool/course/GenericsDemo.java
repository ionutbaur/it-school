package com.itschool.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenericsDemo {

    public static void main(String[] args) {
        //listGeneric();
        //customGenericClass();
        String[] strings = {"ionutz", "baur"};
        Integer[] integers = {123, 456};

        //printGenericArray(strings);
        //printGenericArray(integers);

        GenericPerson<Person> personGeneric = new GenericPerson<>();
        GenericPerson<Child> childGenericPerson = new GenericPerson<>();
        //GenericPerson<Grandson> grandsonGeneric = new GenericPerson<>(); // not working

        List<String> list = List.of("ionutz", "gabriel");
        printGenericWildCardList(list);
    }

    private static void printGenericWildCardList(List<?> list) {
        System.out.println(list.getFirst());
        System.out.println(list);
    }

    private static <T> void printGenericArray(T[] array) {
        for (T el : array) {
            System.out.println(el);
        }
    }

    private static void customGenericClass() {
        GenericClass<String> genericClass = new GenericClass<>("ionutz");
        String string = genericClass.getType();

        GenericClass<Integer> genericClassInteger = new GenericClass<>(123);
        Integer integer = genericClassInteger.getType();
        System.out.println(integer);
        genericClassInteger.setType(789);
        System.out.println(genericClassInteger.getType());

        GenericClass<Boolean> genericClass1 = new GenericClass<>(true);

        Person person = new Person("ionutz", 123L);
        GenericClass<Person> genericClass2 = new GenericClass<>(person);
    }

    private static void listGeneric() {
        List<String> list = new ArrayList<>();
        list.add("ionutz");
        list.add("andrei");
        list.add("dalina");

        List<Integer> list2 = new ArrayList<>();
        list2.add(123);

        System.out.println(list);

        for (String o : list) {
            System.out.println(o);
        }
    }
}

