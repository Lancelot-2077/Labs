package Lab5;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        int numberCase;

        do {
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose (1–4): ");
            numberCase = scanner.nextInt();

            switch (numberCase) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = deposit(scanner, balance);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid! Enter 1–4.");
            }
        } while (numberCase != 4);

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("Balance: " + balance);
    }

    static double deposit(Scanner scanner, double balance) {
        System.out.print("Amount +: ");
        double refill = scanner.nextDouble();
        if (refill > 0) {
            balance += refill;
            System.out.printf("+%.2f | Balance: %.2f%n", refill, balance);
        } else {
            System.out.println("Invalid amount!");
        }
        return balance;
    }

    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Amount -: ");
        double out = scanner.nextDouble();

        if (out > 0 && out <= balance) {
            balance -= out;
            System.out.printf("-%.2f | Balance: %.2f%n", out, balance);
        } else if (out > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid amount!");
        }
        return balance;
    }
}