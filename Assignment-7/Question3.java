import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List <String> strings = new ArrayList<>();
        strings.add("Rohit Mukhi");
        strings.add("Anthony Stark");
        strings.add("Peter Parker");
        strings.add("Benjamin Tennyson");

        // Sorting the name using the sort() method of List class that takes the value returned by the comparator method. The comparator method is used as parameter
        strings.sort((a, b) -> {
            return -1*Integer.compare(a.length(), b.length());
        });

        // Printing the names
        for(String word : strings)
            System.out.println(word);
    }
}
 
