import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();
        System.out.println("Enter your birth month:");
        int birthmonth = scanner.nextInt();
        System.out.println("Enter yiur birth day:" );
        int birthDay = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(birthYear,birthmonth,birthDay);
        LocalDate currDate = LocalDate.now();
        Period agePeriod = Period.between(birthDate, currDate);
        int years = agePeriod.getYears();
        int months = agePeriod.getMonths();
        int days = agePeriod.getDays();
        System.out.println("Your age is:"+"years,"+ months + "months,and"+ days + "days.");
        scanner.close();
    }
}