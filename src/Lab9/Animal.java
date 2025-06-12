package Lab9;

public class Animal {
        void makeSound() {
            System.out.println ("Some animal make sound");
        }
    }

    class Dog extends Animal {
        void makeSound() {
            System.out.println ("Bark");
        }
    }

    class Cat extends Animal {
        void makeSound() {
            System.out.println ("Meow");
        }
    }

   class Ji{
    public static void main(String[]args){
        Animal[] animals = { new Dog(), new Cat(), new Animal() };

        for(Animal animal: animals){
            animal.makeSound();
        }
    }
    }


