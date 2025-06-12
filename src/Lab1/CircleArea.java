package Lab1;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("R: ");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("S: " + area);
    }
}

