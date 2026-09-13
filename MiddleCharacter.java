import java.util.Scanner;

public class MiddleCharacter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("insert a word: ");
        String word = s.nextLine();

        System.out.println("middle of the string is: " + middle(word));

        s.close();
    }

    public static String middle(String x) {
        
        int middle = x.length() / 2;
        
        if (x.length() % 2 != 0) {
            return x.substring(middle, middle + 1);
        } else {
            return x.substring(middle - 1, middle + 1);
        }

    }
    
}
