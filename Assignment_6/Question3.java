// use the append here
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question_10 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String filename = "diary.txt";
      File file = new File(filename);
      if (file.exists()) {
         System.out.println("File exists");
      } else {
         System.out.println("Creating new file!");
      }

      System.out.print("Enter your diary entry : ");
      String diaryEntry = scanner.nextLine();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
      String dateTime = LocalDateTime.now().format(formatter);

      try {
         BufferedWriter br = new BufferedWriter(new FileWriter(filename));
         br.write(diaryEntry);
         br.newLine();
         br.write(dateTime);
         br.close();
      } catch (IOException var8) {
         var8.printStackTrace();
      }

      scanner.close();
   }
}

