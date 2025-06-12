package Lab3;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 1 + (int)(Math.random() * 100);

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
