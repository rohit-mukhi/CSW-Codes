public class Question6 {    
    public static void main(String[] args) {
        CharSequence chs = "HPKILY";
        System.out.println("Character at index 1 : " + chs.charAt(1) );
        System.out.println("Length of String : " + chs.length());
        System.out.println("A subsequence is : " + chs.subSequence(1, 3));
        System.out.println("Original String : " + chs.toString());
        System.out.println();

        Fruits name = new Fruits("Strawberry");
        System.out.println(name.length());
        System.out.println(name.subSequence(1, 3));
        System.out.println(name.charAt(2));


    }
}

class Fruits implements CharSequence {
    private String fruitName;
    Fruits(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public int length() {
        return fruitName.length();
    }

    @Override
    public char charAt(int i) {
        return fruitName.charAt(i);
    }

    @Override
    public String subSequence(int s, int e) {
        return fruitName.substring(s, e);
    }
}
