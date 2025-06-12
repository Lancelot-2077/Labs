package Lab3;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1 + (int)(Math.random() * 100);
        }

        System.out.print("Array: ");
        for (int n : arr) System.out.print(n + " ");
    }
}
