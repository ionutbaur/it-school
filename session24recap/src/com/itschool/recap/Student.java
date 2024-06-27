package com.itschool.recap;

public class Student {

    private final String name;
    private int luckyNumber;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", luckyNumber=" + luckyNumber +
                '}';
    }
}
