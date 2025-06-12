package Lab2;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Num: ");
        double n = s.nextDouble();

        System.out.printf("Sqrt: %.2f\n", Math.sqrt(n));
        System.out.printf("Round: %d\n", Math.round(n));
        System.out.printf("Pow2: %.2f\n", Math.pow(n, 2));
        System.out.printf("Sin: %.2f\n", Math.sin(n));
    }
}

