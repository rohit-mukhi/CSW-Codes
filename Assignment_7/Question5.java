import java.util.function.Function;
public class A7Q5 {
    public static Function<Integer, Integer> getSquareFunction(){
     return x->x*x;
    }
    public static void main(String[] args) {
        
        Function<Integer,Integer> square=getSquareFunction();
        System.out.println("square of 4: "+square.apply(4));
        System.out.println("square of 7: "+square.apply(7));
        System.out.println("square of 10: "+square.apply(10));
        }
}
