// Module 3 - Q3
// Create a class Book with instance variables title, author, and price.
// Write a default constructor and two parameterized constructors:
//  • One to initialize title and author only.
//  • The other to initialize all fields.
//  • Print the values for each constructor.

class Book {
    String title;
    String author;
    double price;

    
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

  
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class M3_Q3 {
    public static void main(String[] args) {
        Book b1 = new Book();  // default
        Book b2 = new Book("Java Basics", "James Gosling");
        Book b3 = new Book("Advanced Java", "Herbert Schildt", 550.0);

        b1.printDetails();
        b2.printDetails();
        b3.printDetails();
    }
}
