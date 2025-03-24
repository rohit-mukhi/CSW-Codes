import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question6 {

    private int[] data;
    public Question6(int size) {
        this.data = new int[size];
    }

    private static void printMemoryUsage(Runtime run, SimpleDateFormat sdf, String label) {
        String timeStamp = sdf.format(new Date());
        long totalMemory = run.totalMemory()/1024;
        long freeMemory = run.freeMemory()/1024;
        long usedMemory = totalMemory - freeMemory;
        System.out.printf("[%s]%s - Total heap : %d MB | Free heap : %d MB | Used heap : %d MB%n", timeStamp, label, totalMemory, freeMemory, usedMemory);
    }
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        List<Question6> objectList = new ArrayList<>();
        
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        printMemoryUsage(run, sdf, "At start : ");

        for(int i=0; i<100000; i++) {
            objectList.add(new Question6(1000));
            if(i%10000 == 0) {
                printMemoryUsage(run, sdf, "After creating " + i + " Objects");
            }
        }

        objectList.clear();
        System.gc();
        printMemoryUsage(run, sdf, "After clearing the list");
      }
}
