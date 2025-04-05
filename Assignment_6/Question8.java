import java.io.*;
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file name : ");
        File file = new File(scan.nextLine());
        
        if(!file.exists()) {
            System.out.println("File does not exist");
            scan.close();
            return;
        }

        System.out.println("File Metadata : ");
        System.out.println("Name : " + file.getName());
        System.out.println("Absolute path : " + file.getAbsolutePath());
        System.out.println("Size : " + file.length() + " B");
        System.out.println("Readability : " + file.canRead());
        System.out.println("Writeability : " + file.canWrite());
        System.out.println("Executability : " + file.canExecute());
        scan.close();
    }
}
