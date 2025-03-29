public class Question1 {
    public static void main(String[] args) {
        String str = "Kafka";
        String str2 = "";
        for(int i=str.length()-1; i>=0; i--) {
            str2 = str2 + str.charAt(i);
        }
        str = str2;
        System.out.println(str);
    }    
}
