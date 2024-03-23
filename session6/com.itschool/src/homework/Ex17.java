package homework;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username and password, please.");

        boolean hasUsername = scanner.nextBoolean();
        boolean hasPassword = scanner.nextBoolean();

        if (hasUsername && hasPassword) {
            System.out.println("Authentication successfull");
        } else if (hasPassword) {
            System.out.println("Authentication failed");
        } else if (hasUsername) {
            System.out.println("Password is incorrect");
        }
    }
}

//    Ionut:
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter username: ");
//                boolean hasUsername = !"".equals(scanner.nextLine()); // input text should not be empty
//
//                System.out.println("Enter password: ");
//                boolean hasPassword = !"".equals(scanner.nextLine());
//
//                if (hasUsername && hasPassword) { // if both valid then success
//                System.out.println("Authentication successful");
//                } else if (hasUsername && !hasPassword) { // I can be here only if the above condition is not satisfied,
//                System.out.println("Password is incorrect");
//                } else { // the only thing left is the opposite of the above conditions (at least one of hasUsername or hasPassword is false)
//                System.out.println("Authentication failed");
//                }
