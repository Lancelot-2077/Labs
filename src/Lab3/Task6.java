package Lab3;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {45, 67, 12, 90, 33, 22, 88};
        int min = arr[0], max = arr[0], sum = 0, evens = 0;

        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
            if (n % 2 == 0) evens++;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + (sum / (double)arr.length));
        System.out.println("Even: " + evens);
    }
}
