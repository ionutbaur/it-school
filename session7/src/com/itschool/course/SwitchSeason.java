package com.itschool.course;

public class SwitchSeason {

    public static void main(String[] args) {
        Season season = Season.SPRING;
        String text = "bla";
        switch (season) {
            case AUTUMN -> System.out.println("The leafs are falling!");
            case WINTER -> System.out.println("It's snowing!");
            case SPRING -> System.out.println("The flowers are green");
            case SUMMER -> System.out.println("I'm on the beach!");
            default -> System.out.println("Unknown season!");
        }

        if (season == Season.AUTUMN && 1 > -2) {
            System.out.println("AUTUMN");
        } else if (season == Season.WINTER) {
            System.out.println("");
        } else if (season == Season.SPRING) {

        } else {
            System.out.println("unknown");
        }
    }
}
