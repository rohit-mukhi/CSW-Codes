import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word1 = scan.nextLine();
        System.out.print("Enter another word : ");
        String word2 = scan.nextLine();
        System.out.println("Lowercase word 1 : " + word1.toLowerCase());
        System.out.println("Upprecase word 1 : " + word1.toUpperCase());
        System.out.println("Lowercase word 2 : " + word2.toLowerCase());
        System.out.println("Uppercase word 2 : " + word2.toUpperCase());
        System.out.println("Equality (case sensitive) : " + word1.equals(word2));
        System.out.println("Equality (not case sensitive) : " + word1.equalsIgnoreCase(word2));
        scan.close();
    }    
}
