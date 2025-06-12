package Lab5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static String[] elements = {"🍒", "🍋", "🍊", "🏆", "⚓"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bid;
        int win;
        String game;

        System.out.println("Welcome to Slot Machine!");
        System.out.println("Symbols: " + Arrays.toString(elements));

        do {
            System.out.println("Balance: $" + balance);
            if (balance == 0) {
                System.out.println("You're out of money!");
                return;
            }

            System.out.print("Your bet: ");
            bid = scanner.nextInt();
            scanner.nextLine();

            if (bid <= 0 || balance < bid) {
                System.out.println("Invalid bet!");
                continue;
            }

            balance -= bid;
            String[] result = spinRow();
            printRow(result);
            win = getPayout(result, bid);
            balance += win;

            if (win > 0) {
                System.out.println("You won: $" + win);
            } else {
                System.out.println("You lost: $" + bid);
            }

            System.out.println("New balance: $" + balance);
            System.out.print("Play again? (yes/no): ");
            game = scanner.nextLine();
        } while (game.equals("yes"));

        System.out.println("Thanks for playing!");
    }

    static String[] spinRow() {
        Random random = new Random();
        String[] randomElements = new String[3];
        for (int i = 0; i < 3; i++) {
            randomElements[i] = elements[random.nextInt(elements.length)];
        }
        return randomElements;
    }

    static void printRow(String[] row) {
        System.out.println("***************");
        System.out.printf(" %s | %s | %s%n", row[0], row[1], row[2]);
        System.out.println("***************");
    }

    static int getPayout(String[] row, int bet) {
        boolean allMatch = row[0].equals(row[1]) && row[1].equals(row[2]);
        if (allMatch) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🏆" -> bet * 10;
                case "⚓" -> bet * 100;
                default -> 0;
            };
        }

        String repeated = null;
        if (row[0].equals(row[1]) || row[0].equals(row[2])) repeated = row[0];
        else if (row[1].equals(row[2])) repeated = row[1];

        if (repeated != null) {
            return switch (repeated) {
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🏆" -> bet * 5;
                case "⚓" -> bet * 6;
                default -> 0;
            };
        }

        return 0;
    }
}
