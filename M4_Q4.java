// Module 4 - Q4
// Different doctors charge different consultation fees. 
// The base class Doctor has a method consultationFee(). 
// Override it in subclasses Dentist, Cardiologist, and Surgeon to show different fees. 

class Doctor {
    void consultationFee() {
        System.out.println("General doctor fee: 300");
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist fee: 500");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist fee: 1000");
    }
}

class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon fee: 1500");
    }
}

public class M4_Q4 {
    public static void main(String[] args) {
        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();
        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}
