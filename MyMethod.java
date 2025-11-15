public class MyMethods {
    public static void main(String[] args) {
        greet("Alice"); // Calls the greet method with "Alice" as an argument
        int result = add(3, 4); // Calls the add method and stores the result
        System.out.println("Sum: " + result);
    }

    // Method to greet a person
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }
}
