package com.itschool.recap.string.manipulation;

import java.util.Scanner;

public class Ex8BasicCompression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Compress the string
        String compressedString = compressString(input);
        System.out.println("Compressed string: " + compressedString);
    }

    private static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // if the current character is the same as the next character, increment count
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // if the current character is different from the next character or it's the last character
                // append the character and its count to the compressed string
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1; // Reset count for the next character
            }
        }

        return compressed.toString();
    }
}
