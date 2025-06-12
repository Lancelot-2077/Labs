package Lab3;
import java.util.Scanner;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {11, 22, 33, 44, 55};

        System.out.print("Index: ");
        int i = s.nextInt();
        System.out.print("New: ");
        int val = s.nextInt();

        if (i >= 0 && i < arr.length) arr[i] = val;

        System.out.println("Updated: " + Arrays.toString(arr));
    }
}
