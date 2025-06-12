package Lab4;

public class Task7 {
    static int counter = 0;

    public static void increment() {
        counter++;
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();
        System.out.println("Counter: " + counter);
    }
}
