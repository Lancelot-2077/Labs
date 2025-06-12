package Lab3;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N: ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) sum += i;

        System.out.println("Sum: " + sum);
    }
}
