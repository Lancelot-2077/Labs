package Lab3;
import java.util.Scanner;
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "]: ");
            arr[i] = s.nextInt();
        }

        System.out.print("Duplicates: ");
        boolean found = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) System.out.print("None");
    }
}
