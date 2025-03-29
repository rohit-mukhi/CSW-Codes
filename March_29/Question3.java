// Learn about other moethods in StringBuilder

public class Question3 {
    public static void main(String[] args) throws Exception {
        Appendable obj = new StringBuilder();
        obj.append("Hi Buck");
        obj.append('!');
        System.out.println(obj);

         StringBuffer obj1 = new StringBuffer("What");
        obj1.insert(4, "l");
        System.out.println(obj1);

        System.out.println(obj1.capacity());
        // It is dynamic memory allocation, even if you do not use all the space, java reserves some space for more allocation
        // Capacity changes on its own
        System.out.println(obj1.length());
    }
}
