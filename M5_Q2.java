// Module 5 - Q2
// Create a program that reads an array size from the user and allocates an array dynamically.
// Handle NegativeArraySizeException if the user enters a negative size.

import java.util.Scanner;

public class M5_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        try {
            int[] arr = new int[size];
            System.out.println("Array of size " + size + " created successfully.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative.");
        }
        sc.close();
    }
}
