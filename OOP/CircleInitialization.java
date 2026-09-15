package OOP;

class Circle {
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}

public class CircleInitialization {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        System.out.println("Radius of c1 = " + c1.getRadius());
        System.out.println("Radius of c2 = " + c2.getRadius());
    }
}
