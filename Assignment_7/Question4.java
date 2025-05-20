public class Question4 {
    public static void main(String[] args) {
        int length = 25;
        int breadth = 78;
        Shape rectangle = () -> {
            return (length*breadth);
        };
        System.out.println("Area of reactangle: " + rectangle.printArea());

        int radius = 36;
        Shape circle = () -> {
            return Math.PI * Math.pow(radius, 2);
        };

        System.out.println("Area of circle: " + circle.printArea());
    }
}

interface Shape {
    public double printArea();
}
