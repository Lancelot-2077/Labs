package Lab6;

public class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old.");
    }
}

class Pe {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.age = 25;
        p.introduce();
    }
}


