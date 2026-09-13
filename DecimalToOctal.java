import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char octa[] = {'0','1','2','3','4','5','6','7',};
        String octal = "";

        System.out.print("insert decimal number: ");
        int decimal = sc.nextInt();

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = octa[remainder] + octal;
            decimal /= 8;
        }
        System.out.println(octal);
        sc.close();
    }
}
