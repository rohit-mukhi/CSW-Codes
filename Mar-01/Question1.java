public class Question1 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcc";

        int res = str1.compareTo(str2);

        if(res < 0) {
            System.out.println("str1 is lexicographically smaller than str2");
        } else {
            System.out.println("str2 is lexicographically greater than str1");
        }

        int res2 = str1.compareToIgnoreCase(str2);

        if(res2 > 0) {
            System.out.println("str2 is lexicographically greater than str1");
        } else {
            System.out.println("str1 is lexicographically smaller than str2");
        }
    }    
}
