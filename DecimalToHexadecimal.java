import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
        String hexadecimal = "";

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal = hex[remainder] + hexadecimal;
            decimal /= 16;
        }

        System.out.println(hexadecimal);
        sc.close();
    }
}
