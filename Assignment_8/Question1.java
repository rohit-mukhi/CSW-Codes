public class Question1 {
    public static void main(String[] args) {
        My_Thread t = new My_Thread();
        t.start();
    }
}

class My_Thread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
