package homework;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number reprezenting the age, please.");

        int age = scanner.nextInt();
        String result = (age < 12) ? "Child" : (age >= 12 && age <= 17) ? "Teenager" : (age >= 18 && age <= 64) ? "Adult" : "Senior";

        System.out.println("The age group is " + result);
    }
}


