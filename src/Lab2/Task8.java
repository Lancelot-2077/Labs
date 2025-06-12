package Lab2;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Email: ");
        String e = s.nextLine();

        int at = e.indexOf('@');
        if (at == -1) {
            System.out.println("Invalid email.");
        } else {
            String user = e.substring(0, at);
            String domain = e.substring(at + 1);
            System.out.printf("User: %s, Domain: %s\n", user, domain);
        }
    }
}
