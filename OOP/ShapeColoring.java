package OOP;

class Shape2 {
    String color;

    public Shape2(String color) {
        this.color = color;
    }
}

class Triangle extends Shape2 {
    double base;
    double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        double area = 0.5 * base * height;
        return area;
    }
}

class Square extends Shape2 {
    double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        double area = side * side;
        return area;
    }
}

public class ShapeColoring {
    public static void main(String[] args) {
        Triangle t = new Triangle("Red", 4, 6); 
        Square s = new Square("Blue", 5);
        
        System.out.println("Triangle color: " + t.color + ", Area: " + t.getArea());
        System.out.println("Square color: " + s.color + ", Area: " + s.getArea());
    }
}
