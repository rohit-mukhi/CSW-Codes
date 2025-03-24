public class Question8 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);

        // If hashcode is same then memory location is same
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println();

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // When object their reference is different but their position in the heap is same.
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
