package Lab2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Min: ");
        int min = s.nextInt();
        System.out.print("Max: ");
        int max = s.nextInt();

        int r = min + (int)(Math.random() * (max - min + 1));
        String p = (r % 2 == 0) ? "Even" : "Odd";

        System.out.println("Rand: " + r);
        System.out.println("It is " + p);
    }
}
