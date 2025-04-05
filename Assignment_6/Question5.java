import java.util.Scanner;
import java.io.File;
public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name to delete : ");
        String fileName = scan.nextLine();

        File file = new File(fileName);
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("File deleted!");
            } else {
                System.out.println("File not deleted!");
            }
        } else {
            System.out.println("File does not exist!");
        }
        scan.close();
    }
}
