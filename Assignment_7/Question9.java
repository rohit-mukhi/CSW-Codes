import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Question3 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2025, 2, 9);
        LocalDate date2 = LocalDate.of(2025, 11, 24);
        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Interval: " + days);
    }
}
