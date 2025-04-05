import java.util.*;
import java.io.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name : ");
        File file = new File(scan.nextLine());
        
        if(!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        System.out.println("Enter new file name : ");
        File newFileName = new File(scan.nextLine());

        if(file.renameTo(newFileName)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Failed to rename file");
        }
    }
}
