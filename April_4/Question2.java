import java.io.File;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        File file = new File("samples.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (file.exists()) {
            System.out.println("File exists!");
            if (file.canWrite()) {
                System.out.println("File can be written to!");
            } else {
                System.out.println("File cannot be written to!");
            }

            boolean writable = file.setWritable(false);
            if (writable) {
                System.out.println("Write permission enabled.");
            } else {
                System.out.println("Write permission cannot be enabled.");
            }
        } else {
            System.out.println("File does not exist!");
        }
    }
}
