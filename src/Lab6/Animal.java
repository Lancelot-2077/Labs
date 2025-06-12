package Lab6;

public class Animal {
    String name;
    String sound;

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void makeSound() {
        System.out.println(name + " makes sound: " + sound);
    }
}

class An {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Cat", "meow"),
                new Animal("Dog", "bark"),
                new Animal("Cow", "moo")
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
