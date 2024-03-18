package homework;

import java.util.Scanner;
public class Ex20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 3 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
        System.out.println("Largest Number: " + largest);

    }
}
