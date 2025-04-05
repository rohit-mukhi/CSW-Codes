import java.util.*;
import java.io.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file path : ");
        File file = new File(scan.nextLine());
        if (!file.exists()) {
            System.out.println("File does not exists!");
            scan.close();
            return;
        }

        System.out.println("Enter destination file path : ");
        File destinationFile = new File(scan.nextLine());

        if(!destinationFile.exists()) {
            System.out.println("Destination file does not exists!");
            System.out.println("Creating new destination file...");
            copy(file, destinationFile, false);
        } else {
            System.out.println("Destination file already exists! (Overwrite y/n) : ");
            boolean x = scan.next().toLowerCase().charAt(0) == 'y';
            copy(file, destinationFile, !x);
        }
        scan.close();
    }

    public static void copy(File s, File d, boolean x) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(s));
            BufferedWriter bw = new BufferedWriter(new FileWriter(d, x));
            String line;
            while ((line = br.readLine()) != null) {    
                bw.write(line);
                bw.newLine();
                bw.close();
            }    
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
