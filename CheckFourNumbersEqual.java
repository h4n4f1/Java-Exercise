import java.util.Scanner;

public class CheckFourNumbersEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("insert first number: ");
        int num1 = sc.nextInt();
        System.out.print("insert second number: ");
        int num2 = sc.nextInt();
        System.out.print("insert third number: ");
        int num3 = sc.nextInt();
        System.out.print("insert fourth number: ");
        int num4 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        sc.close();
    }
}
