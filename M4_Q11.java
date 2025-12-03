// Module 4 - Q11
// Use java.util.ArrayList to: 
// Add 5 names 
// Remove 1 name 
// Print the final list 

import java.util.ArrayList;

public class M4_Q11 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Sneha");
        names.add("Karan");
        System.out.println("Original list: " + names);
        names.remove("Amit");
        System.out.println("Final list: " + names);
    }
}
