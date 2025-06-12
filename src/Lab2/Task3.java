package Lab2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("2 nums: ");
        int a = s.nextInt();
        int b = s.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);
    }
}

