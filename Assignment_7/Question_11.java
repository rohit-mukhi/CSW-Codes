import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter date 1 (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(scan.next());

        System.out.print("Enter date 2 (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(scan.next());

        long days = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Time period: " + days);
        
        scan.close();
    }
}
