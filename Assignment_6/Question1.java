import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "diary.txt";
        File file = new File(filename);
        if(file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("Creating new file!");
        }
        System.out.print("Enter your diary entry : ");
        String diaryEntry = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        String currentDateTime = LocalDateTime.now().format(formatter);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write(diaryEntry);
            bw.newLine();
            bw.write(currentDateTime);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
