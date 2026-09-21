package OOP;

class MathUtils {

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("sum: " + sum);
    }

    public void add(int a, int b,int c) {
        int sum = a + b + c;
        System.out.println("sum: " + sum);
    }

    public void add(double a, double b) {
        double sum = a + b;
        System.out.println("sum: " + sum);
    }

}

public class UniversalCalculator {
    public static void main(String[] args) {
        MathUtils m = new MathUtils(); 
        m.add(2, 3); 
        m.add(2, 3, 4); 
        m.add(2.5, 3.5);
    }
}
