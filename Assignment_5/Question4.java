import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = scan.next();
        StringBuffer obj = new StringBuffer(word);
        char ch = 'y';
        String str;
        int s, e;
        while(ch == 'y') {
            System.out.print("Enter operation (1-append at, 2-delete, 3-replace at, 4-concat at end, 5-display) : ");
            int op = scan.nextInt();
            switch(op) {
                case 1: System.out.print("Enter word to append : ");
                        str = scan.next();
                        char chs[] = str.toCharArray();
                        System.out.println("Enter start index : ");
                        s = scan.nextInt();
                        if(s>obj.toString().length())
                            System.out.println("Invalid index");
                        else
                            obj.append(chs, s, chs.length);
                        break;
                case 2: System.out.print("Enter start and end indices for deletion : ");
                        s = scan.nextInt();
                        e = scan.nextInt();
                        if(s<0 || e > obj.toString().length() || s>obj.toString().length())
                            System.out.println("Index out of bound!");
                        else
                        obj.delete(s-1, e-1);
                        break;
                case 3: System.out.print("Enter start and end indices and word to replace : ");
                        s = scan.nextInt();
                        e = scan.nextInt();                        
                        str = scan.next();
                         if(s<0 || e > obj.toString().length() || s>obj.toString().length())
                            System.out.println("Index out of bound!");
                        else
                        obj.replace(s-1, s-1, str);
                        break;
                case 4: System.out.print("Enter word to concat at end : ");
                        str = scan.next();
                        obj.append(str);
                        break;
                case 5: System.out.print(obj.toString());
                        System.out.println();
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
