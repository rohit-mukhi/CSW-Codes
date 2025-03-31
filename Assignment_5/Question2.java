public class Question2 {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.methods();  
        // String str1 = new String("Rohit");
        // String str2 = "Rohit";
        // System.out.println(System.identityHashCode(str1));
        // System.out.println(System.identityHashCode(str2));
        // String str4 = "Hello";
        // System.out.println(System.identityHashCode(str4));
    }
}

class Test implements CharSequence {
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public void methods() {
        CharSequence cs = "Hello";
        System.out.println("Identity of Charsequence : " + System.identityHashCode(cs));
        String str = "Hello";
        System.out.println("Identity of String : " + System.identityHashCode(str));
        System.out.println("Updating values : ");

        cs = "Thor Odinson";
        System.out.println("New identity of Charsequence after updation : " + System.identityHashCode(cs));
        str = "Valkyrie";
        System.out.println("New identity of String after updation : " + System.identityHashCode(str));
    }
}
