public class InheritancePractice {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Rover"), new Cat("Misty")};
        for (Animal animal : animals) {
            animal.describe();
            animal.speak();
        }
    }
}

abstract class Animal {
    private final String name;

    Animal(String name) {
        this.name = name;
    }

    String getName() { return name; }

    void describe() {
        System.out.println(getName() + " is an animal.");
    }

    abstract void speak();
}

final class Dog extends Animal {
    Dog(String name) { super(name); }

    @Override
    void speak() { System.out.println(getName() + " says woof."); }
}

final class Cat extends Animal {
    Cat(String name) { super(name); }

    @Override
    void speak() { System.out.println(getName() + " says meow."); }
}
