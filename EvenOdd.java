public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        if(num %2 == 0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System[]args){
            System.out.println("Enter a number:");
            int num = sc.nextint();
            if(num %2 == 0)
            System.out.println("Even");
            else
            System.out.println("odd");
            sc.close();
        }

    }

    
}
