public class Question4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("Memory Address (str1) : " + System.identityHashCode(str1));
        System.out.println("Memory Address (str2) : " + System.identityHashCode(str2));
        System.out.println("Memory Address (str3) : " + System.identityHashCode(str3));
        System.out.println("Memory Address (str4) : " + System.identityHashCode(str4));
    }    
}
