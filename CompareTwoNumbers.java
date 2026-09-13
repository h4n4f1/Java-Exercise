import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("insert first number: ");
        int num1 = sc.nextInt();

        System.out.print("insert second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) { System.out.println(num1+" > "+num2); };
        if (num1 < num2) { System.out.println(num1+" < "+num2); };
        if (num1 == num2) { System.out.println(num1+" == "+num2); };
        if (num1 <= num2) { System.out.println(num1+" <= "+num2); };
        if (num1 >= num2) { System.out.println(num1+" >= "+num2); };
        if (num1 != num2) { System.out.println(num1+" != "+num2); };
        sc.close();
    }
}//32