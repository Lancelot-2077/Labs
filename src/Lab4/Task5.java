package Lab4;

public class Task5 {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Circle: " + calculateArea(3));
        System.out.println("Rectangle: " + calculateArea(4, 5));
    }
}
