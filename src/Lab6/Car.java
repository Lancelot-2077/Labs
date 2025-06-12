package Lab6;

public class Car {
    String brand;
    String model;
    int speed;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    void accelerate(int inc) {
        speed += inc;
    }

    void printInfo() {
        System.out.println("Car: " + brand + " " + model + ", Speed: " + speed + " km/h");
    }
}

class Ca {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.accelerate(50);
        car.printInfo();
    }
}
