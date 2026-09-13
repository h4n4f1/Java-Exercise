package OOP;
import java.util.Scanner;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("insert length: ");
        double length = s.nextDouble();

        System.out.print("insert width: ");
        double width = s.nextDouble();

        Rectangle rect = new Rectangle(length, width);

        System.out.println("Area = " + rect.getArea());
        System.out.print("Perimeterr = " + rect.getPerimeter());
        
        s.close();
    }
}
