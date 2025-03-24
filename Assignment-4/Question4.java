import java.lang.ref.Cleaner;

public class Question4 {
    public static void main(String[] args) {
        new MyClass("Main object");
        System.gc();
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyClass {
    private static final Cleaner cleaner = Cleaner.create();
    static class CleanupTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Cleaning up objects");
        }
    }

    private final Cleaner.Cleanable cleanable;
    private String name; 
    
    MyClass(String str) {
        this.cleanable = cleaner.register(this, new CleanupTask());
        this.name = str;
        System.out.println(this.name + " created");
    }
}
