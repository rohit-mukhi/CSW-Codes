import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = scan.next();
        char ch = 'y';
        String str;
        while(ch == 'y') {
            System.out.print("Enter operation (1-Lowercase, 2-Uppercase, 3-search a character, 4-concat, 5-display) : ");
            int op = scan.nextInt();
            switch(op) {
                case 1: word = word.toLowerCase();
                        break;
                case 2: word = word.toUpperCase();
                        break;
                case 3: System.out.println("Enter a character to search : ");
                        char chs = scan.next().charAt(0);
                        int index = word.indexOf(chs);
                        if(index != -1) 
                            System.out.println("Character not present.");
                        else 
                            System.out.println(ch + " is present at index " + word.indexOf(ch));
                        break;
                case 4: System.out.println("Enter word to concat : ");
                        str = scan.next();
                        word = word.concat(str);
                        break;
                case 5: System.out.println(word);
                        break;
                default: System.out.print("Invalid input!");
                        break;
            }
            System.out.print("Do you want to continue (y/n) : ");
            ch = scan.next().charAt(0);
            ch = Character.toLowerCase(ch);
        }
        System.out.println("See you again!");
        scan.close();
    }    
}
