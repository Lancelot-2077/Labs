package Lab4;

public class Task9 {
    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum1: " + sum(1, 2, 3));
        System.out.println("Sum2: " + sum(10, 20, 30, 40));
    }
}
