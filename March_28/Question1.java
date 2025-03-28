public class Question1 {
    public static void main(String[] args) {
        String str1 = "Rohit";
        String str2 = "Rohit";
        String str3 = new String("Rohit");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
    }
}
