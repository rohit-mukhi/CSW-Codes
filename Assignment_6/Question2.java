import java.io.*;

public class Question9 {
    public static void main(String[] args) {
        File file = new File("diary.txt");
        if(!file.exists()) {
            System.out.println("File does not exists");
            return;
        }

        try(BufferedReader br = new BufferedReader(new FileReader("diary.txt"))) {
            String line;
            System.out.println("Diary contents : ");
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
