// Assignment questions begin from here

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Question2 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2025, 5, 9, 8, 44, 20);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd:mm:yyyy hh:mm:ss");
        System.out.println("Date and time: " + date.format(format));
    }
}
