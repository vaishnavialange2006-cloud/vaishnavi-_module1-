// Module 5 - Q4
// Write a Java program that attempts to open a file and then read its first line.
// Handle both FileNotFoundException and IOException separately.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class M5_Q4 {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Problem while reading the file.");
        }
    }
}
