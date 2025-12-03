// Module 4 - Q8
// Override toString() in a Book class so printing an object shows Book[title=Java, price=500]. 
// Create a Car object and print its runtime class using getClass(). 
// Override equals() and hashCode() in Student so two students with same roll number are equal. 
// Create a Movie object, assign values, and print meaningful output using toString(). 
// Override hashCode() in Player so players with same age have same hash code. 

class BookM4 {
    String title;
    int price;

    public BookM4(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }
}

class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }
}

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.rollNo == other.rollNo;
    }

    public int hashCode() {
        return Integer.hashCode(rollNo);
    }
}

class Movie {
    String title;
    String genre;
    int duration;

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String toString() {
        return "Movie[title=" + title + ", genre=" + genre + ", duration=" + duration + " mins]";
    }
}

class Player {
    String name;
    int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return Integer.hashCode(age);
    }

    public String toString() {
        return "Player[name=" + name + ", age=" + age + "]";
    }
}

public class M4_Q8 {
    public static void main(String[] args) {
        BookM4 b = new BookM4("Java", 500);
        System.out.println(b);
        Car c = new Car("Swift");
        System.out.println("Car runtime class: " + c.getClass());
        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(1, "Rohit");
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        Movie m = new Movie("Inception", "Sci-Fi", 148);
        System.out.println(m);
        Player p1 = new Player("Virat", 30);
        Player p2 = new Player("Rohit", 30);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
    }
}
