import java.util.Scanner;

public class input
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int i = 0;

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        while (num != 0) {
            arr[i++] = num % 2;
            num /= 2;
        }

        for (int x = i - 1; x >= 0; x--) {
            System.out.print(arr[x]);
        }

        sc.close();
    }
}