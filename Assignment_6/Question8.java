import java.io.*;
import java.text.SimpleDateFormat;
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

        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");

        System.out.println("File Metadata : ");
        System.out.println("Name : " + file.getName());
        System.out.println("Absolute path : " + file.getAbsolutePath());
        System.out.println("Size : " + file.length() + " B");
        System.out.println("Readability : " + file.canRead());
        System.out.println("Writeability : " + file.canWrite());
        System.out.println("Executability : " + file.canExecute());
        System.out.println("Space used : " + (file.getTotalSpace()/(1024*1024*1024)) + " MB");
        System.out.println("Space free : " + (file.getUsableSpace()/ (1024*1024*1024)) + " MB");
        System.out.println("File created on : " + sdf.format(file.lastModified()));
        scan.close();
    }
}
