// Module 5 - Q1
// Write a Java program to read two numbers from the user and perform modulus (%) operation.
// Handle the case where the second number is zero using ArithmeticException.

import java.util.Scanner;

public class M5_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        try {
            int result = a % b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot perform modulus by zero.");
        }
        sc.close();
    }
}
