package com.itschool.course;

public class ForEachStatement {

    public static void main(String[] args) {
        String[] array = {"text1", "text2", "text3"};
        Object[][] mixedArray = { {1, "ionutz"}, {2, 6.7, true}};

        int[] intArray = {5, 7, 9, 13};
        //      position  0, 1, 2, 3
        for (int number : intArray) {
            System.out.println("Number is: " + number);
        }
        System.out.println("===end");

        int matrix[][] = { {5, 7, 9, 13}, {1, 2, 3, 4} };

        var x = new EqualyInh();
        var y = "ionutz";
        System.out.println(x);
    }
}
