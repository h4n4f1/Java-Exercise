import java.util.Scanner;

public class FindAverage {

    public static double average(double x, double y, double z) {
        double result = (x + y + z) / 3;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("insert first number: ");
        double num1 = s.nextDouble();

        System.out.print("insert second number: ");
        double num2 = s.nextDouble();
        
        System.out.print("insert third number: ");
        double num3 = s.nextDouble();

        System.out.println("Average: " + average(num1, num2, num3));

        s.close();
    }

}
