package Lab2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Text: ");
        String t = s.nextLine();

        System.out.println("Len: " + t.length());
        System.out.println("1st: " + t.charAt(0));
        System.out.println("Last: " + t.charAt(t.length() - 1));
        System.out.println("UP: " + t.toUpperCase());
        System.out.println("LOW: " + t.toLowerCase());
        System.out.println("Sub: " + t.substring(0, Math.min(3, t.length())));
        System.out.println("Has 'Java': " + t.contains("Java"));
    }
}

