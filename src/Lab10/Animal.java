package Lab10;

public abstract class Animal {
    abstract void makeSound();
    void sleep(){
        System.out.println("Sleeping");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}
class Ku{
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        dog.sleep();
    }
}
