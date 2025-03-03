import java.util.*;                      
public class Book {
    private int bookID;
    private String bookName;
    private double price;

    public Book(int bookID, String bookName, double price) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [bookID=" + bookID + ", bookName=" + bookName + ", price=" + price + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return Double.compare(otherBook.price, price) == 0;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book(0, "", 0.0);
        Book book2 = new Book(0, "", 0.0);

        System.out.println("Enter details for the first book:");
        System.out.print("Book ID: ");
        book1.setBookID(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Book Name: ");
        book1.setBookName(scanner.nextLine());
        System.out.print("Book Price: ");
        book1.setPrice(scanner.nextDouble());

        System.out.println("\nEnter details for the second book:");
        System.out.print("Book ID: ");
        book2.setBookID(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Book Name: ");
        book2.setBookName(scanner.nextLine());
        System.out.print("Book Price: ");
        book2.setPrice(scanner.nextDouble());

        System.out.println("\nDetails of the first book:");
        System.out.println(book1.toString());
        
        System.out.println("\nDetails of the second book:");
        System.out.println(book2.toString());

        if (book1.equals(book2)) {
            System.out.println("\nBoth books have the same price.");
        } else {
            System.out.println("\nThe books have different prices.");
        }
    }
}




