public class PolymorphismPractice {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2.0), new Rectangle(3.0, 4.0)};
        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n", shape.getName(), shape.area());
        }
    }
}

abstract class Shape {
    abstract double area();
    abstract String getName();
}

final class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be positive");
        this.radius = radius;
    }

    @Override double area() { return Math.PI * radius * radius; }
    @Override String getName() { return "Circle"; }
}

final class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Dimensions must be positive");
        this.width = width;
        this.height = height;
    }

    @Override double area() { return width * height; }
    @Override String getName() { return "Rectangle"; }
}
