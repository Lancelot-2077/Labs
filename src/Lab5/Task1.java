package Lab5;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Monthly: ");
        double monthlyDeposit = scanner.nextDouble();
        System.out.print("Rate (%): ");
        double annualRate = scanner.nextDouble() / 100;
        System.out.print("Years: ");
        int years = scanner.nextInt();
        System.out.print("Compounded: ");
        int timesCompounded = scanner.nextInt();

        int totalMonth = years * 12;
        double balance = 0;
        for (int i = 0; i < totalMonth; i++) {
            balance += monthlyDeposit;
            balance *= Math.pow(1 + (annualRate / timesCompounded), (1.0 * timesCompounded / 12));
        }

        System.out.printf("After %d yrs: %.2f", years, balance);
        scanner.close();
    }
}
