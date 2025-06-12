package Lab1;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть своє ім'я: ");
        String name = scanner.nextLine();

        System.out.print("Введіть свій вік: ");
        int age = scanner.nextInt();

        System.out.print("Введіть свій зріст (у метрах): ");
        double height = scanner.nextDouble();

        System.out.print("Ви студент? (так/ні): ");
        scanner.nextLine(); // зчитати залишок рядка
        String studentAnswer = scanner.nextLine();
        boolean isStudent = studentAnswer.equalsIgnoreCase("так");

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age + " років");
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
    }
}

