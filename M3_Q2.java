// Module 3 - Q2
// Create a Cellphone class with methods to print actions:
// Example methods: print "ringing...", "vibrating...", etc.

class Cellphone {
    void ringing() {
        System.out.println("ringing...");
    }

    void vibrating() {
        System.out.println("vibrating...");
    }

    void callFriend() {
        System.out.println("calling friend...");
    }
}

public class M3_Q2 {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.ringing();
        phone.vibrating();
        phone.callFriend();
    }
}
