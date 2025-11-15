import java.util.Scanner;

public class pro4 {
    static void unipolarNRZ(int[] data){
        System.out.println("Unipolar NRZ Encoding:");
        for(int bit :data){
            if(bit==1)System.out.println("+1");
            else System.out.println("0");
        }
        System.out.println();
    }
    static void polarNRZ(int[]data){
        System.out.println(" Polar NRZ Encoding:");
        for(int bit : data){
        if(bit==1)System.out.print("+1");
        else System.out.print("=1");
        }
        System.out.println();
    }
static void manchester(int[] data){
    System.err.println("Manchester Encoding:");
    for(int bit : data){
    if(bit==1)System.out.print("+1,-1");
    else System.out.print("-1,+1");
    }
    System.out.println();
}
static void differentialManchester(int[]data){
    System.out.println("Differntial Manchester Encoding:");
    int lastTransition = 1;
    for(int bit : data){
        if(bit==1){
            System.out.print("-1,+1");
        }else{
            System.out.print(lastTransition==1 ?"-1,+1":"+1,-1");
        }
        lastTransition = -lastTransition;
    }
    System.out.println();
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of bits in the data:");
    int n = sc.nextInt();
    int[]data = new int[n];
    System.out.println("Enter the binary data  bits(0s and 1s): ");
    for(int i=0; i<n; i++){
        data[i] = sc.nextInt();
    }
    System.out.println("Choose a line coding technique:");
    System.out.println("1. Unipolar NRZ");
    System.out.println("2. Polar NRZ");
    System.out.println("3. Manchester");
    System.out.println("4.Differential Manchester");
    System.out.print("Enter your choice(1-4):");
    int choice = sc.nextInt();
    switch (choice) {
        case 1:
        unipolarNRZ(data);
        break;
        case 2:
        polarNRZ(data);    
        break;
        case 3:
        manchester(data);
        break;
        case 4:
        differentialManchester(data);
        break;
        default:
        System.out.println("Invlid choice.Please select between 1 and 4.");
    }
    sc.close();

}
}    


    

