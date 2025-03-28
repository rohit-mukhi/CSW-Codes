public class Question3 {
    public static void main(String[] args) {
        String str1 = "Joking";
        String str2 = new String("Joking");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
