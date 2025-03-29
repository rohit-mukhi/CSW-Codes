public class Question2 {
    public static void main(String[] args) {
        StringBuffer obj1 = new StringBuffer("Rohit");
        StringBuffer obj2 = new StringBuffer("Popcorn");
        System.out.println(obj1.toString().compareTo(obj2.toString()));
        // So to use the compareTo() method you need to convert the StringBuffer obj to String first.      
    }
}
