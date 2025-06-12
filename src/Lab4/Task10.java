package Lab4;

public class Task10 {
    public static void printNumbers(String message, int... numbers) {
        System.out.println(message);
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers("Values:", 4, 5, 6);
    }
}
