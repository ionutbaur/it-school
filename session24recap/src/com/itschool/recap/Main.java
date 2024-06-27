package com.itschool.recap;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("")); //student name here
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));
        students.add(new Student(""));

        students.sort(Comparator.comparing(Student::getName));

        /*for (int i = 0; i < students.size(); i++) {
            System.out.println(i + " -> " + students.get(i));
        }*/

        students.get(0).setLuckyNumber(13);
        students.get(1).setLuckyNumber(1);
        students.get(2).setLuckyNumber(10);
        students.get(3).setLuckyNumber(8);
        students.get(4).setLuckyNumber(4);
        students.get(5).setLuckyNumber(15);
        students.get(6).setLuckyNumber(21);
        students.get(7).setLuckyNumber(5);
        students.get(8).setLuckyNumber(0);
        students.get(9).setLuckyNumber(17);
        students.get(10).setLuckyNumber(3);
        students.get(11).setLuckyNumber(11);
        students.get(12).setLuckyNumber(20);
        students.get(13).setLuckyNumber(2);

        students.sort(Comparator.comparing(Student::getLuckyNumber));
        //students.forEach(System.out::println);

        Collections.shuffle(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(i+1 + ". " + students.get(i));
        }
    }
}
