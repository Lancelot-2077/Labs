package Lab4;

public class Task11 {
    public static int findMax(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max: " + findMax(1, 8, 3, 15, 9));
    }
}
