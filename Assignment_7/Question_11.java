import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        LocalDate date1 = LocalDate.of(2025, 5, 9);
        LocalDate date2 = LocalDate.of(2025, 6, 30);

        long days = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Time period: " + days);
        
        scan.close();
    }
}
