public class Practice05Models {
    public static void main(String[] args) {
        Car car = new Car("Mina", "Toyota", "JT12345", 45.0);
        car.start();
        System.out.println("Fuel: " + car.getFuelLevel() + "%");
        car.stop();

        Dog dog = new Dog("Rover", 4, "Labrador");
        dog.bark();
        dog.spin();
        dog.run();

        Book titleOnly = new Book("Clean Code");
        Book titleAndAuthor = new Book("Effective Java", "Joshua Bloch");
        System.out.println(titleOnly);
        System.out.println(titleAndAuthor);
    }
}

final class Car {
    private final String owner;
    private final String brand;
    private final String serialNumber;
    private double fuelLevel;
    private boolean running;

    Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        setFuelLevel(fuelLevel);
    }

    void start() {
        if (fuelLevel <= 0) {
            System.out.println("Cannot start: the car is out of fuel.");
            return;
        }
        running = true;
        System.out.println(brand + " started for " + owner + ".");
    }

    void stop() {
        running = false;
        System.out.println("Car stopped.");
    }

    double getFuelLevel() {
        return fuelLevel;
    }

    private void setFuelLevel(double fuelLevel) {
        if (fuelLevel < 0 || fuelLevel > 100) {
            throw new IllegalArgumentException("Fuel level must be from 0 to 100");
        }
        this.fuelLevel = fuelLevel;
    }
}

final class Dog {
    private final String name;
    private final int age;
    private final String breed;

    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void bark() { System.out.println(name + " barks."); }
    void spin() { System.out.println(name + " spins around."); }
    void run() { System.out.println(name + " runs."); }
}

final class Book {
    private final String title;
    private final String author;

    Book(String title) {
        this(title, "Unknown");
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}
