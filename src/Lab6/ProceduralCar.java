package Lab6;

public class ProceduralCar {
    static String brand;
    static String model;
    static int speed;

    static void accelerate(int inc) {
        speed += inc;
    }

    static void printInfo() {
        System.out.println("Car: " + brand + " " + model + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        brand = "Toyota";
        model = "Corolla";
        speed = 0;

        accelerate(50);
        printInfo();
    }
}
