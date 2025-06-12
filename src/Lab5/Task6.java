package Lab5;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Game started!");
        String playAgain = "yes";
        do {
            System.out.print("Choose rock, paper, or scissors: ");
            String player = "";
            boolean valid = false;
            while (!valid) {
                player = scanner.nextLine().toLowerCase();
                for (String option : options) {
                    if (player.equals(option)) {
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.print("Invalid input. Try again: ");
                }
            }
            String computer = options[random.nextInt(3)];
            System.out.println("Computer chose: " + computer);
            short result = -1;

            if (player.equals(computer)) {
                result = 0;
            } else if ((player.equals("rock") && computer.equals("scissors")) ||
                    (player.equals("paper") && computer.equals("rock")) ||
                    (player.equals("scissors") && computer.equals("paper"))) {
                result = 1;
            }
            switch (result) {
                case 1 -> System.out.println("You win!");
                case 0 -> System.out.println("It's a draw.");
                case -1 -> System.out.println("You lose.");
            }
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}