import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate date1=null;
        LocalDate date2=null;
        try {
            System.out.print("Enter date 1 (yyyy-mm-dd): ");
            date1 = LocalDate.parse(scan.next());

            System.out.print("Enter date 2 (yyyy-mm-dd): ");
            date2 = LocalDate.parse(scan.next());
        } catch(Exception e) {
            e.printStackTrace();
        }

        long days = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Time period: " + days);
        
        scan.close();
    }
}
