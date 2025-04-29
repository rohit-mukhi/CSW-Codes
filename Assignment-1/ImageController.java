import java.util.HashSet;
import java.util.Scanner;

public class ImageController {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        HashSet<Image> ImageLibrary = new HashSet<>();
        Character ch = 'y';
        while(ch == 'y') {
            System.out.println("Enter 1 - to create image\n2 - search an image\n3 - to add an existing image");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            switch(choice) {
                case 1: Image img = enterDetails();
                        ImageLibrary.add(img);
                        break;
                case 2: System.out.print("Enter color code to search : ");
                        String colorCode = scan.next();
                        if(search(colorCode, ImageLibrary) == -1)
                            System.out.println("Image not found!");
                        break;
                default: System.out.println("Invalid input!");
                         break;
            }
            System.out.print("Do you want to continue? (y/n): ");
            ch = scan.next().charAt(0);
            ch = Character.toLowerCase(ch);
        }
        System.out.println("See you again!");
        scan.close();
    }

    public static Image enterDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter width : ");
        int width = scan.nextInt();
        System.out.print("Enter Height : ");
        int height = scan.nextInt();
        System.out.print("Enter color code : ");
        String colorCode = scan.next();
        Image temp = new Image(width, height, colorCode);
        return temp;
    } 

    public static int search(String colorCode, HashSet <Image> ImageLibrary) {
        for(Image img : ImageLibrary) {
            if(img.getColorCode().equals(colorCode)) {
                System.out.println("Image found!");
                System.out.println(img.toString()); 
                return 1;
            }
        }
        return -1;
    }
}

class Image {
    private int imageWidth, imageHeight;
    private String colorCode;

    Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    void setWidth(int width) {
        this.imageWidth = width;
    } 

    void setHeight(int height) {
        this.imageHeight = height;
    }

    void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    int getWidth() {
        return this.imageWidth;
    }

    int getHeight() {
        return this.imageHeight;
    }

    String getColorCode() {
        return this.colorCode;
    }

    @Override
    public String toString() {
        return "Width: " + this.imageWidth + " Height: " + this.imageHeight + " Color Code: " + this.colorCode;
    }
}
