import java.io.File;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter directory path : ");
        File file = new File(scan.nextLine());

        if(file.exists() && file.isDirectory()) {
            File files[] = file.listFiles();
            if(files != null) {
                for(File f : files) {
                    System.out.println(f.getName());
                }
            } else {
                System.out.println("No files in the directory");
            }
        } else {
            System.out.println("Invalid directory path");
        }
        scan.close();
    }    
}
