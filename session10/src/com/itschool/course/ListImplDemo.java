package com.itschool.course;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListImplDemo {

    public static void main(String[] args) {
        //arrayListDemo();
        linkedListDemo();
    }

    private static void arrayListDemo() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ionutz");
        arrayList.add("baur");
        arrayList.add("it-school");
        arrayList.remove("baur");

        System.out.println(arrayList);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(7);

        System.out.println("Array list contains object?");
        System.out.println(intList.contains(4));

        System.out.println(intList.isEmpty());
        System.out.println(intList.size());

        intList.clear();
        System.out.println(intList);
        System.out.println(intList.isEmpty());

    }

    private static void linkedListDemo() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("elem1");
        linkedList.add("elem2");

        System.out.println(linkedList);
    }

}
