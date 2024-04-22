package com.itschool.course;

public class ComplexArrays {

    public static void main(String[] args) {
        int[] simpleArray1 = {1, 2, 3};
        int[] simpleArray2 = {4, 5, 6};
        int[] simpleArray3 = {7, 8, 9};

        int[][] complexArray = { simpleArray1, simpleArray2, simpleArray3};
        complexFor: for (int[] simpleArray : complexArray) {
            simpleFor: for (int element : simpleArray) {
                System.out.print(element + " ");
            }
            System.out.println("========");
        }
    }
}
