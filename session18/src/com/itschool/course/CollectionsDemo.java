package com.itschool.course;

import java.util.*;

public class CollectionsDemo {

    private static final List<String> names = List.of("ionutz", "ionutz", "andreea");

    public static void main(String[] args) {
        //listDemo();
        //immutableListDemo();
        demoOfSetCollection();
    }

    private static void demoOfSetCollection() {
        Set<Season> seasons = Set.of(Season.SPRING, Season.AUTUMN);

        Set<String> names = new HashSet<>();
        names.add("ionutz");
        names.add("vasile");
        names.add("ionutz");
        names.add("george");
        names.add("andreea");
        names.add("elena");

        System.out.println(names);

        Set<String> sortedNamesByInsertionOrder = new LinkedHashSet<>();
        sortedNamesByInsertionOrder.add("ionutz");
        sortedNamesByInsertionOrder.add("vasile");
        sortedNamesByInsertionOrder.add("ionutz");
        sortedNamesByInsertionOrder.add("george");
        sortedNamesByInsertionOrder.add("andreea");
        sortedNamesByInsertionOrder.add("elena");
        System.out.println(sortedNamesByInsertionOrder);

        Set<String> sortedNames = new TreeSet<>(Comparator.reverseOrder());
        sortedNames.add("ionutz");
        sortedNames.add("vasile");
        sortedNames.add("ionutz");
        sortedNames.add("george");
        sortedNames.add("andreea");
        sortedNames.add("elena");
        System.out.println(sortedNames);

        List<String> setToList = new LinkedList<>(sortedNames);
        Set<String> listBackToSet = new HashSet<>(setToList);
    }

    private static void listDemo() {
        List<String> names = new ArrayList<>();
        List<Integer> integers = new LinkedList<>();
        names.add("ionutz");
        names.add("ionutz");
        names.add("andreea");
        names.add("andra");
        names.add("mihai");
        names.add("ionutz");
        names.add(1, "dragos");
        System.out.println(names.isEmpty());

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        //names.remove("ionutz");
        removeIonutz(names);
        names.remove("alex");

        /*boolean isFound = false;
        for (String name : names) {
            System.out.println("Names are: " + name);
            if ("andreea".equals(name)) {
                isFound = true;
                break;
            }
        }
        System.out.println("Andreea found in loop: " + isFound);*/ // not needed

        boolean isAndreeaFound = names.contains("andreea");
        System.out.println("Andreea found with contains: " + isAndreeaFound);
        //Collections.sort(names);
        //Collections.sort(names, Comparator.reverseOrder());
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }

    private static void removeIonutz(List<String> names) {
        final String ionutzToRemove = "ionutz";
        if (names.contains(ionutzToRemove)) {
            names.remove(ionutzToRemove);
            removeIonutz(names);
        }
    }

    private static void immutableListDemo() {
        List<String> names = List.of("ionutz", "ionutz", "andreea");
        //names.add("george");
        System.out.println(names);
    }
}
