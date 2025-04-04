import java.io.File;
import java.io.IOException;
public class Question1 {
    public static void main(String[] args) {
        try {
            File file = new File("newFile.txt");
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}
