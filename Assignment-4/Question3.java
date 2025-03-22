public class Question3 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Main Object 1");
        MyClass obj2 = new MyClass("Main Object 2");
        obj1 = obj2;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class MyClass {
    private String name;
    public MyClass(String name) {
        this.name = name;
        System.out.println("Object created : " + name);
    }

    public void show() {
        MyClass obj1 = new MyClass("Object 1");
        obj1.display();
    }

    public void display() {
        MyClass obj2 = new MyClass("Object 2");
    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected : " + name);
    }
}
