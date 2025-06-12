package Lab5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] questions = {
                "1. Who was first president of USA?",
                "2. Who killed Kennedy?",
                "3. How many rockets do have South Korea?"
        };
        String[][] answers = {
                {" 1. G.Washington", "2. Donald Duck", "3. Donald Trump", "4. Obama "},
                {" 1. L.H.Oswald", "2. J.W.Gacy", "3. Me ", "4. Obama "},
                {" 1. 100", "2. 10", "3. 30", "4. 2.5 "}
        };
        int[] correctAnswers = {1, 4, 2};

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String answer : answers[i]) {
                System.out.println(answer);
            }
            System.out.print("Enter the number of the correct answer: ");
            int input = 0;
            boolean valid = false;
            while (!valid) {
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    if (input >= 1 && input <= 4) {
                        valid = true;
                    } else {
                        System.out.println("Choose a number from 1 to 4.");
                    }
                } else {
                    System.out.print("Enter a number: ");
                    scanner.next();
                }
            }
            if (input == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("You got " + score + " out of " + questions.length);
        scanner.close();
    }
}
