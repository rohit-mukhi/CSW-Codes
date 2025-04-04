import java.io.IOException;
import java.io.FileReader;
public class Question4 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("sample.txt");
            int character;
            while((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
