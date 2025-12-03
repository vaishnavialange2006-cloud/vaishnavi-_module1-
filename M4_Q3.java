// Module 4 - Q3
// Create a Transport class with method move(). 
// Bus class (extends Transport) with method carryPassengers(). 
// Truck class (extends Transport) with method carryGoods(). 
// Demonstrate hierarchical inheritance by creating both objects. 

class Transport {
    void move() {
        System.out.println("Transport is moving...");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck is carrying goods.");
    }
}

public class M4_Q3 {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.move();
        b.carryPassengers();

        Truck t = new Truck();
        t.move();
        t.carryGoods();
    }
}
