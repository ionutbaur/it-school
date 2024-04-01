package com.itschool.homework;

public class EX3 {

    public static void main(String[] args) {

        String[] lists = {"Such", "a", "wonderfull", "day"};
        StringBuilder stringBuilder = new StringBuilder();
        for (String list : lists) {
            stringBuilder.append(list).append(" ");
        }
        System.out.println("The concatenated strings: " + stringBuilder.toString());
    }
}
