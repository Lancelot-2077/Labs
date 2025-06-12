package Lab3;

public class Task3 {
    public static void main(String[] args) {
        int i;

        System.out.println("Using for:");
        for (i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        System.out.println("\nUsing while:");
        i = 1;
        while (i <= 10) {
            System.out.println("7 x " + i + " = " + (7 * i));
            i++;
        }

        System.out.println("\nUsing do-while:");
        i = 1;
        do {
            System.out.println("7 x " + i + " = " + (7 * i));
            i++;
        } while (i <= 10);
    }
}
