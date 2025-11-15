import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for subject1:");
        int subject1Marks = scanner.nextInt();
        System.out.println("Enter marks for subject2:");
        int subject2Marks = scanner.nextInt();
        System.out.println("Enter marks for subject3:");
        int subject3Marks = scanner.nextInt(); 
        int totalMarks = subject1Marks+subject2Marks+subject3Marks;
        double averageMarks = (double) totalMarks/3;
        System.out.println("TotalMarks:"+totalMarks);
        System.out.println("AverageMarks;"+averageMarks);
        scanner.close();
    }
}
