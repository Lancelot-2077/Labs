package Lab1;
import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        byte age = scanner.nextByte();
        System.out.println("Age: " + age);
    }
}

