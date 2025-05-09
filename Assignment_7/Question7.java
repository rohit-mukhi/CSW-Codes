// Figure out how to make it work
// This is not an assignment question

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Question1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Local Date Time: " + dateTime);

        System.out.println();
        
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);

        System.out.println("Today: " + today);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last momth: " + lastMonth);

        LocalDate date1 = LocalDate.of(2024, 5, 1);
        LocalDate date2 = LocalDate.of(2074, 6, 1);

        // try to compare the dates

        LocalDateTime timesNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:mm:yyyy  hh:mm:ss");
        String format = timesNow.format(formatter);
        System.out.println("Formatted time: " + format);

        //parsing
        LocalDate parsDate = LocalDate.parse(format);
        DateTimeFormatter.ofPattern("hh:mm:ss  dd:mm:yyyy");
        // Figure out what to do here

    }
}
