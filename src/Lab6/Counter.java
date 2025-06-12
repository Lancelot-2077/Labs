package Lab6;

public class Counter {
    int count = 0;

    void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

class StaticCounter {
    static int count = 0;

    static void increment() {
        count++;
    }

    static int getCount() {
        return count;
    }
}

class Co {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        c1.increment();
        c2.increment();

        System.out.println("c1 count = " + c1.getCount());
        System.out.println("c2 count = " + c2.getCount());

        StaticCounter.increment();
        StaticCounter.increment();

        System.out.println("StaticCounter count = " + StaticCounter.getCount());
    }
}

