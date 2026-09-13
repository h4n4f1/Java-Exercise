import java.util.Scanner;

public class FindSmallestNumber {
    public static int smallestNumber(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y <  x && y < z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert first number: ");
        int num1 = sc.nextInt();

        System.out.print("Insert second number: ");
        int num2 = sc.nextInt();

        System.out.print("Insert third number: ");
        int num3 = sc.nextInt();

        System.out.println("The smallest number is: " + smallestNumber(num1,num2,num3));

        sc.close();
    }
}
