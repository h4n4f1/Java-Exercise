package OOP;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle1 extends Shape {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle2 extends Shape {
    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Shape c = new Circle1(3); 
        Shape r = new Rectangle2(4, 5);

        System.out.printf("Circle area: %.2f%n", c.calculateArea());
        System.out.println("Rectangle area: " + r.calculateArea());
    }
}
