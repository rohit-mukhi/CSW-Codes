// Here is exampple of CharSequence interface.

public class Question6 {    
    public static void main(String[] args) {
        CharSequence chs = "HPKILY";
        System.out.println("Character at index 1 : " + chs.charAt(1) );
        System.out.println("Length of String : " + chs.length());
        System.out.println("A subsequence is : " + chs.subSequence(1, 3));
        System.out.println("Original String : " + chs.toString());
    }
}
