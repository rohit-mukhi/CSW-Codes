public class ASS7Q1 {
    public static void main(String[] args) {
        StringProcessor lengthProcessor = (str) -> {
            System.out.println("Length of String: " + str.length());    
        };
        lengthProcessor.printLength("Hello World");
    }
}

interface StringProcessor {
    public void printLength(String str);
}
