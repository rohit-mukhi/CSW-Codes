import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sent = scan.nextLine();
        StringBuilder sb = new StringBuilder(sent);
        System.out.println("Original sentence" + sb.toString());
        System.out.print("Enter word to replace : ");
        String word = scan.nextLine();
        System.out.print("Enter word to replace with : ");
        String word2 = scan.nextLine();
        sb.replace(sb.indexOf(word), sb.indexOf(word) + word.length(), word2);
        System.out.println("Updated sentence : " + sb.toString());
        scan.close();
    }    
}
