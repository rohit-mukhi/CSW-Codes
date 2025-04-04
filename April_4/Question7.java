import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question7 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));
            bw.write("Remember me in your memories!");
            bw.newLine();
            bw.write("I will always be with you.");
            bw.close();
            System.out.println("File created and written successfully.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
