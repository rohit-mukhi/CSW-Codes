public class Question2 {
    public static void main(String[] args) {
        String str1 = new String("Rohit");
        String str2 = str1.intern();
        String str3 = new String("Rohit").intern();

        System.out.println(str1 == str2);
        System.out.println(str2 == "Rohit");
        System.out.println(str2 == str3);
    }    
}
