public class Question2 {
    public static void main(String[] args) {
        String str1 = new String("Rohit");
        String str2 = str1.intern();
        String str3 = new String("Rohit").intern();

        System.out.println(str1 == str2);
        System.out.println(str2 == "Rohit");
        System.out.println(str2 == str3);

        String str4 = new String("Joker").intern();
        String str5 = "Joker";
        String str6 = new String("Joker").intern();

        System.out.println(str4 == str5);
        System.out.println(str4 == str6);
        System.out.println(str5 == str6);
    }    
}
