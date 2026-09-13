import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("insert length: ");
        double length = sc.nextDouble();

        double area = (6 * (length * length)) / (4 * Math.tan(Math.PI / 6));

        System.out.println(area);
        sc.close();
    }
}
