package com.itschool.course;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        sortArrays();
    }

    private static void lightArray() {
        int[] intArray = {1, 2, 3};
        int[] zeroArray = new int[4];
        String[] stringArray = {"Ala", "Bala", "Portocala"};
        String[] fiveStringArray = new String[5];

        System.out.println(Arrays.toString(zeroArray));
        System.out.println(Arrays.toString(fiveStringArray));

        String[] arrayWithNewAndFixed = new String[] {"Ala", "Bala", "Portocala"};
        String string = "ceva";
    }

    private static void sortArrays() {
        String[] cities = {"Iasi", "Iasi", "Bucuresti", "Cluj"};
        System.out.println("Unsorted cities");
        System.out.println(Arrays.toString(cities));

        String[] citiesCopied = Arrays.copyOf(cities, cities.length);

        /*String a = "Hello";
        String b = "Hello";

        System.out.println("Comparing strings:");
        System.out.println(b.compareTo(a));*/

        Arrays.sort(cities);
        System.out.println("Natural sorted cities:");
        System.out.println(Arrays.toString(cities));

        System.out.println("Index of Iasi is: ");
        int index = Arrays.binarySearch(cities, "Iasi");
        System.out.println(index);

        Arrays.sort(cities, (o1, o2) -> Character.valueOf(o2.charAt(0)).compareTo(o1.charAt(0)));
        System.out.println("Reversed natural order of cities:");
        System.out.println(Arrays.toString(cities));

        System.out.println("Copied cities");
        System.out.println(Arrays.toString(citiesCopied));

        System.out.println("Index of Iasi in unsorted array:");
        int index2 = Arrays.binarySearch(citiesCopied, "Iasi");
        System.out.println(index2);

    }

    private static void method(String a, int... args) {
        for (int arg : args) {

        }
    }
}
