import java.lang.ref.Cleaner;

public class Question2 {
    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("MainObject");
        obj.show();
        obj = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class UnreachableObject {
    private static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;
    private final String name;

    private static class CleanupAction implements Runnable {
        private final String name;
        CleanupAction(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Garbage Collected " + name);
        }
    }

    public UnreachableObject(String name) {
        this.name = name;
        System.out.println("Object Created!" + name);
        this.cleanable = cleaner.register(this, new CleanupAction(name));
    }

    public void show() {
        UnreachableObject obj1 = new UnreachableObject("Object1");
        obj1.display();
    }

    public void display() {
        UnreachableObject obj2 = new UnreachableObject("Object2");
    }
}
