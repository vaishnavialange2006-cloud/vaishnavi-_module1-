// Module 4 - Q6
// A logistics app has a base class Transport and subclasses Truck, Ship, and Airplane, 
// each with a deliver() method. Show what will determine which version of deliver() executes 
// when a Transport reference is used. 

class Transport2 {
    void deliver() {
        System.out.println("Generic transport delivery.");
    }
}

class Truck2 extends Transport2 {
    void deliver() {
        System.out.println("Delivering by Truck.");
    }
}

class Ship2 extends Transport2 {
    void deliver() {
        System.out.println("Delivering by Ship.");
    }
}

class Airplane2 extends Transport2 {
    void deliver() {
        System.out.println("Delivering by Airplane.");
    }
}

public class M4_Q6 {
    public static void main(String[] args) {
        Transport2 t;
        t = new Truck2();
        t.deliver();
        t = new Ship2();
        t.deliver();
        t = new Airplane2();
        t.deliver();
    }
}
