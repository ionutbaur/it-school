package homework;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        System.out.println("Please enter a number:");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            a = a * i;
        }
        System.out.println("The factorial of the number is:");

    }
}
