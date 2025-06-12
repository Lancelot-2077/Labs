package Lab9.Shape1;

class Shape {
    double area() {
        return 0.0;
    }
}

class Circle extends Lab9.Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Lab9.Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Lab9.Shape[] shapes = {
                new Lab9.Circle(3),
                new Rectangle(4, 5),
                new Lab9.Shape()
        };

        for (Lab9.Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}