// Here we have not handled concurrency

public class Question4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<=3; i++) 
                    System.out.println("Thread running: " + Thread.currentThread().getName() + " count: " + i);
            }
        });        
        Thread t2 = new Thread(new Runnable() {
           public void run() {
                for(int i=0; i<=3; i++)
                    System.out.println("Thread running: " + Thread.currentThread().getName() + " count: " + i);
           } 
        });

        t1.start();
        t2.start();
    }
}


