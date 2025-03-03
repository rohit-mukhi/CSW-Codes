import java.util.*;

public class Question2 implements Comparable<Question2> {
  String name;
  public Question2(String name) {
    this.name = name;
  }

  public int compareTo(Question2 other) {
    return this.name.compareTo(other.name);
  }

  @Override
  public String toString() {
    return name;
  }

  public static void main(String args[]) {
        List<Question2> list = Arrays.asList(new Question2("Tony"), new Question2("Peter"), new Question2("Thor"));
        Collections.sort(list);
        System.out.println(list);
  }
}
