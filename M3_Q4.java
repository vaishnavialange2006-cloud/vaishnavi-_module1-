// Module 3 - Q4
// Create a class Cylinder and use getters and setters to set its radius and height.
// • Use Q1 to calculate surface area and volume of the cylinder.
// • Use a constructor and repeat Q1.
// • Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.

class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {}

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public void printDetails() {
        System.out.println("Rectangle [length=" + length + ", breadth=" + breadth + ", area=" + area() + "]");
    }
}

public class M3_Q4 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(3.0);
        c1.setHeight(7.0);
        System.out.println("Cylinder 1 Surface Area: " + c1.surfaceArea());
        System.out.println("Cylinder 1 Volume: " + c1.volume());

        Cylinder c2 = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder 2 Surface Area: " + c2.surfaceArea());
        System.out.println("Cylinder 2 Volume: " + c2.volume());

        Rectangle r1 = new Rectangle();
        r1.printDetails();

        Rectangle r2 = new Rectangle(10, 20);
        r2.printDetails();
    }
}
