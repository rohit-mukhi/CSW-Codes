public class Question5 {
    public static void main(String[] args) {
        SumThread t1 = new SumThread();
        MultiplicationThread t2 = new MultiplicationThread(3);
        t1.start();
        t2.start();
    }
}

class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum += i;
            System.out.println("Intermediary sum between 100 natural numbers: " + sum);
        } 
            
        System.out.println("Sum of 1st 100 natural numbers = " + sum);

        try {
            Thread.sleep(10);
        } catch(InterruptedException e) {
            System.out.println("Addition thread interrupted");
        }
    }
} 

class MultiplicationThread extends Thread {
    private int number;
    MultiplicationThread(int number) {
        this.number = number;
    }

    public void run() {
        for(int i=0; i<=10; i++)
            System.out.println(number + " x " + i + " = " + (number*i));
            
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Multiplication thread interrupted");
        }
    }
}
