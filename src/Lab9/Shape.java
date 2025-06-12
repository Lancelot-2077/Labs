package Lab9;

public class Shape {
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape {
void draw(){
    System.out.println("Drawing circle");
}
}
class Square extends Shape {
    void draw(){
        System.out.println("Drawing square");
    }
}
class Triangle extends Shape {
    void draw(){
        System.out.println("Drawing triangle");
    }
}
class Fo{
    public static void main(String[] args){
        Shape[] shapes = {new Circle(), new Square(), new Triangle(), new Shape()};

        for (Shape shape : shapes){
            shape.draw();
        }
    }
}

