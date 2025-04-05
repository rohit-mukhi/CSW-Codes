public class Question3 {
    public static void main(String[] args) {
        String str1 = "Joking";
        String str2 = new String("Joking");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "Hello";
        String str4 = "hello";
        System.out.println(str3.equalsIgnoreCase(str4);
        System.out.println(str4.lastIndexOf('o'));
        System.out.println(str3.startsWith("He"));
        System.out.println(str4.endsWith("lo"));
        System.out.println(str4.toCharArray());

        String str5 = "18";
        System.out.println(Integer.parseInt(str5));

        int val = 143;
        System.out.println(String.valueOf(val));
    }
}
