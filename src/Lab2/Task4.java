package Lab2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Age: ");
        int age = s.nextInt();

        System.out.println("Name: " + name + ", Age: " + age);
        System.out.printf("Name: %s, Age: %d\n", name, age);
    }
}
