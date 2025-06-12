package Lab3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int secret = 7, guess;

        do {
            System.out.print("Guess: ");
            guess = s.nextInt();
        } while (guess != secret);

        System.out.println("Right!");
    }
}
