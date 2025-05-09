import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = scan.nextDouble();
        System.out.print("Enter rate: ");
        int r = scan.nextInt();
        System.out.print("Enter starting date (yyyy-mm-dd): ");
        String t = scan.next();

        LocalDate date = LocalDate.parse(t);
        LocalDate curr = LocalDate.now();
        long years = ChronoUnit.DAYS.between(date, curr);
        double si =  (p*r*years)/(100*365);
        System.out.println("Amount: " + (p+si));
    }
}
