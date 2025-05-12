public class Question6 {
    public static void main(String[] args) {
        double n1=36, n2=6;
        Thread AdditionThread = new AdditionThread(n1, n2);
        Thread SubtractionThread = new SubtractionThread(n1, n2);
        Thread MultiplicationsThread = new MultiplicationsThread(n1, n2);
        Thread DivisionThread = new DivisionThread(n1, n2);
        AdditionThread.start();
        SubtractionThread.start();
        MultiplicationsThread.start();
        DivisionThread.start(); 
    }
}

class AdditionThread extends Thread {
    private double a,b;
    public AdditionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Sum of "+ a + " and " + b + 
        " is " + (a+b));
    }
}

class SubtractionThread extends Thread {
    private double a,b;
    public SubtractionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Difference of "+ a + " and " + b + 
        " is " + (a-b));
    }
}

class MultiplicationsThread extends Thread {
    private double a,b;
    public MultiplicationsThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Product of "+ a + " and " + b + 
        " is " + (a*b));
    }
}

class DivisionThread extends Thread {
    private double a,b;
    public DivisionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        try {
            System.out.println("Quotient when "+ a + " divides " + b + " is " + (a/b));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

