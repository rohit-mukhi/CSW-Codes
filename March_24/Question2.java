public class Question2 {
    public static void main(String[] args) {
        String str = "Java ";
        System.out.println(str.hashCode());
        str = str.concat("Programming");
        System.out.println(str);
        System.out.println(str.hashCode());

        // It looks like you changed the String in the same memory location, but it happened in a new location while the opiginal location was left but not deleted.
    }
}
