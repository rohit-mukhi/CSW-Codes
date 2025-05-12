public class Question3 {
    public static void main(String[] args) {
        Thread t2 = new Thread(() -> {
            System.out.println("Thread running: " + Thread.currentThread().getName());
        });
        t2.start();
    }
}
