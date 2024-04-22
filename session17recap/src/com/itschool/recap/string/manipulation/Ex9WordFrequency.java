package com.itschool.recap.string.manipulation;

import java.util.Scanner;

public class Ex9WordFrequency {

    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(DELIMITER);
        for (String word : words) {
            int frequency = 0;
            for (String s : words) {
                if (word.equals(s)) {
                    frequency++;
                }
            }
            System.out.println("Frequency of word '" + word + "' is: " + frequency);
        }

    }
}
