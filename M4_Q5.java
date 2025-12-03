// Module 4 - Q5
// You are designing a payment system with a parent class Payment and subclasses 
// CreditCardPayment, UPIPayment, and NetBankingPayment, each overriding the pay() method. 
// Show how the main program uses polymorphism to handle new payment types easily. 

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}

public class M4_Q5 {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment();
        p.pay(1000);
        p = new UPIPayment();
        p.pay(500);
        p = new NetBankingPayment();
        p.pay(2000);
    }
}
