// Module 5 - Q5
// Create a custom exception InvalidEmailException that is thrown when the user enters an email without @ symbol.
// Write a program to validate email input.

import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class M5_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        try {
            validateEmail(email);
            System.out.println("Valid email.");
        } catch (InvalidEmailException e) {
            System.out.println("Invalid email: " + e.getMessage());
        }
        sc.close();
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@' symbol.");
        }
    }
}
