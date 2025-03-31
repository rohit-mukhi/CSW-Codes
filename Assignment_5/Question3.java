import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = scan.next();
        StringBuilder obj = new StringBuilder(word);
        char ch = 'y';
        String str;
        int s, e;
        while(ch == 'y') {
            System.out.print("Enter operation (1-append, 2-delete, 3-replace, 4-reverse, 5-insert, 6-display) : ");
            int op = scan.nextInt();
            switch(op) {
                case 1: System.out.print("Enter word to append : ");
                        str = scan.next();
                        obj.append(str);
                        break;
                case 2: System.out.print("Enter start and end indices for deletion : ");
                        s = scan.nextInt();
                        e = scan.nextInt();
                        obj.delete(s-1, e-1);
                        break;
                case 3: System.out.print("Enter start and end indices and word to replace : ");
                        s = scan.nextInt();
                        e = scan.nextInt();
                        str = scan.next();
                        obj.replace(s-1, e-1, str);
                        break;
                case 4: obj.reverse();
                        break;
                case 5: System.out.print("Enter index and word to insert : ");
                        s = scan.nextInt();
                        str = scan.next();
                        obj.insert(s-1, str);
                        break;
                case 6: System.out.print(obj.toString());
                        System.out.println();
                        break;
                default: System.out.print("Invalid input!");
                        break;
            }
            System.out.print("Do you want to continue (y/n) : ");
            ch = scan.next().charAt(0);
            ch = Character.toLowerCase(ch);
        }
        System.out.println();
        System.out.println("See you again!");
        scan.close();
       
    }    
}

