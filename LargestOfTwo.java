import java.util.Scanner;

public class LargestOfTwo {
    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int largest;
        if(num1>num2){
            largest =num1;
        }
        else{
            largest =num2;
        }
        System.out.println("The largest number is:"+largest);
        scanner.close();


    }
}
