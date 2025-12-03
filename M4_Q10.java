// Module 4 - Q10
// Create a package vehicles. Inside it, create an interface Vehicle with method speed().
// Create classes Bike and Car that implement it. Import and test them in another file.

package vehicles;

interface Vehicle {
    void speed();
}

class Bike implements Vehicle {
    public void speed() {
        System.out.println("Bike speed is 60 km/h.");
    }
}

class Car implements Vehicle {
    public void speed() {
        System.out.println("Car speed is 120 km/h.");
    }
}

public class M4_Q10 {
    public static void main(String[] args) {
        Vehicle b = new Bike();
        Vehicle c = new Car();
        b.speed();
        c.speed();
    }
}
