public class Question7 {
    public static void main(String[] args) {
        int n1= 20, n2=5;
        Thread add = new Thread( () -> {
            System.out.println("Sum = " + (n1+n2));
        });

        Thread sub = new Thread( () -> {
            System.out.println("Difference = " + (n1-n2));
        });

        Thread mul = new Thread( () -> {
            System.out.println("Product: " + (n1*n2));
        });

        Thread div = new Thread( () -> {
            try {   
                System.out.println("Quotient when " + n1 + " divides " + n2 + " is " + (n1/n2));
            } catch(ArithmeticException e) {
                e.printStackTrace();
            }
        });

        add.start();
        sub.start();
        mul.start();
        div.start();
    }
}
