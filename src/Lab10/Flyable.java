package Lab10;

public interface Flyable {
    void fly();
}
abstract class Bird {
    void layEggs(){
        System.out.println("Laying eggs");
    }
    abstract void makeSound();
}

class Sparrow extends Bird implements Flyable{
    void makeSound(){
        System.out.println("Chirp");
    }
    public void fly(){
        System.out.println("Flying");
    }
}
class Fi {
    public static void main(String[] args){
    Sparrow sparrow = new Sparrow();

        sparrow.makeSound();
        sparrow.layEggs();
        sparrow.fly();
}
}