import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
        System.out.print("Enter a character to search : ");
        char ch = scan.next().charAt(0);
        char cha[] = str.toCharArray();
        for(Character c : cha)
            System.out.print(c + " ");
        System.out.println();
        System.out.println("First occurence of " + ch + " is at index : " + str.indexOf(ch));
        System.out.println("Last occurence of " + ch + " is at index : " + str.lastIndexOf(ch));
        scan.close();
    }
}
