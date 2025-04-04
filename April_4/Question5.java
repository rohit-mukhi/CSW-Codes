import java.io.*;

public class Question5 {
    public static void main(String[] args) {
        String name = "sample.txt";
        try (FileInputStream fis = new FileInputStream(name); InputStreamReader isr = new InputStreamReader(fis)) {
                int data;
                while((data = isr.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
    }
}
