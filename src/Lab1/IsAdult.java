package Lab1;
import java.util.Scanner;

public class IsAdult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть свій вік: ");
        int age = scanner.nextInt();
        boolean isAdult = age >= 18;
        System.out.println("Повнолітній: " + isAdult);
    }
}
