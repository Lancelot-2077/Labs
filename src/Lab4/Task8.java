package Lab4;

public class Task8 {
    static int counter = 0;

    public static void setCounter(int counter) {
        System.out.println("Local counter: " + counter);
    }

    public static void main(String[] args) {
        setCounter(5);
        System.out.println("Global counter: " + counter);
    }
}
