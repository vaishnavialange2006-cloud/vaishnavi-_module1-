// Module 4 - Q2
// Create a Shape class with a method displayShape(). 
// Create two subclasses: Circle with a method area() to calculate area of a circle. 
// Rectangle with a method area() to calculate area of a rectangle. 
// In main(), create objects of both subclasses and call methods. 

class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

class Rect extends Shape {
    double length, breadth;

    public Rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class M4_Q2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayShape();
        c.area();

        Rect r = new Rect(4, 6);
        r.displayShape();
        r.area();
    }
}
