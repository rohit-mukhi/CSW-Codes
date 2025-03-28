import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        String str1 = "Banana";
        String str2 = "Banana";
        // Checking lexicographically
        System.out.println(str1.compareTo(str2));

        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Collections.sort(list);
        // The sort method works because the toCompare() is part of String 
        System.out.println(list.toString());
    }    
}

