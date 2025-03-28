// We can see all the locations are different

public class Question4 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(System.identityHashCode(str1));
        str1 = str1.concat(" World");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = "Hello World";
        System.out.println(System.identityHashCode(str3));

        String str4 = "Hello" + " World";
        System.out.println(System.identityHashCode(str4));

        String str5 = "Hello".concat(" World");
        System.out.println(System.identityHashCode(str5));
    }
}
