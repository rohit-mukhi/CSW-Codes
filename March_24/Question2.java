public class Question2 {
    public static void main(String[] args) {
        String str = "Java ";
        System.out.println(str.hashCode());
        str = str.concat("Programming");
        System.out.println(str);
        System.out.println(str.hashCode());
        // It looks like you changed the String in the same memory location, but it happened in a new location while the original location was left but not deleted.

        // Below are some functions of string
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(0, 7));
        System.out.println(str.replace(" Programming", "Script"));
        String str2 = "Apple,Banana,Cherry";
        String arr[] = str2.split(",");
        for(String fruit : arr) {
            System.out.println(fruit);
        }
    }
}
