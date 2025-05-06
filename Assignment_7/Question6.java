import java.util.function.Function;

public class A7Q6 {
    public static Function<Integer, Integer> getFactorialFunction() {
        return (n) -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        };
    }

    public static void main(String[] args) {
        Function<Integer, Integer> factorial = getFactorialFunction();
        System.out.println("Factorial of 10: " +factorial.apply(10));
        System.out.println("Factorial of 15: " +factorial.apply(15));
    }
}
