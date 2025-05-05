public class Question2 {
    public static void main(String[] args) {
        Calculator <Integer> addition = (a, b) -> {
            System.out.println("Sum: " + (a+b));
        };

        Calculator <Integer> subtract = (a, b) -> {
            System.out.println("Difference: " + (a-b));
        };

        Calculator <Integer> multiply = (a, b) -> {
            System.out.println("Product: " + (a*b));
        };

        Calculator <Integer> divide = (a, b) -> {
            System.out.println("Division result: " + (a/b));
        };

        addition.calculate(10, 20);
        subtract.calculate(69, 9);
        multiply.calculate(36, 36);
        divide.calculate(45, 5);
    }
}

@SuppressWarnings("hiding")
interface Calculator <Integer> {
    public void calculate(int a, int b);
}
