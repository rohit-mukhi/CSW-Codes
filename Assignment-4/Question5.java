import java.lang.Runtime;

public class Question5 {
    public static void main(String[] args) {
        //Learn the Runtime class
        Runtime run = Runtime.getRuntime();
        System.out.println("Total memory : " + (run.totalMemory()/1024) + "KB");
        System.out.println("Free memory : " + (run.freeMemory()/1024) + "KB");
        System.out.println("Used memory : " + ((run.totalMemory() - run.freeMemory())/1024) + "KB"); 
        System.out.println();

        TestClass obj1 = new TestClass(10, 20.0);
        TestClass obj2 = new TestClass(30, 70.0);

        obj1.updateVal(15, 25.5);
        obj2.updateVal(45, 19.9);

        System.out.println();

        System.out.println("Total memory : " + (run.totalMemory()/1024) + "KB");
        System.out.println("Free memory : " + (run.freeMemory()/1024) + "KB");
        System.out.println("Used memory : " + ((run.totalMemory() - run.freeMemory())/1024) + "KB"); 
    }
}

class TestClass {
    private int intVal;
    private double dbVal;
    
    public TestClass(int intVal, double dbVal) {
        this.intVal = intVal;
        this.dbVal = dbVal;
        System.out.println("Object created!");
    }

    public void updateVal(int intVal, double dbVal) {
        this.intVal = intVal;
        this.dbVal = dbVal;
        System.out.println("Values updated! intVal = " + this.intVal + " and dbVal = " + dbVal);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected : " + this);
    }

}
