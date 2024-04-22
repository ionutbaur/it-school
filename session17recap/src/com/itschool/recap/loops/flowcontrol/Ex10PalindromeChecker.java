package com.itschool.recap.loops.flowcontrol;

import java.util.Scanner;

public class Ex10PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); // Convert the word to lowercase for case-insensitive comparison

        boolean isPalindrome = true; // start assuming the word is palindrome
        for (int i = 0; i < word.length(); i++) {
            int lastIndex = word.length() - 1; // index starts from 0, so the last available index is length - 1
            // if the chars from array's beginning are different to the ones of array's end (mirroring)
            if (word.charAt(i) != word.charAt(lastIndex - i)) {
                isPalindrome = false; // means it's not palindrome, iteration over.
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("'" + word + "' is a palindrome.");
        } else {
            System.out.println("'" + word + "' is not a palindrome.");
        }
    }
}
