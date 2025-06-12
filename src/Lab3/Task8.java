package Lab3;
import java.util.Scanner;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Find: ");
        int x = s.nextInt();
        boolean found = false;

        for (int n : arr) {
            if (n == x) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not found");
    }
}
