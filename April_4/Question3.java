import java.io.FileWriter;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Suprise! fellas");
            writer.close();
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
