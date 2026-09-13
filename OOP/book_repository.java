package OOP;

import java.util.Scanner;

public class book_repository {
//fixed
    book_repository(String x, String y, int z) {
        this.setbook(x, y, z);
    }

    private String title = "Java Basics";
    private String author = "John";
    private int price = 54;

    public void setbook(String x, String y, int z) {
        this.title = x;
        this.author = y;
        if (z < 0) {
            System.out.println("Invalid price. Price not changed. Current price: " + this.price);
            return;
        } else {
            this.price = z;
        }
    }

    public String getbook() {
        return title + "\n" + author + "\n" + price;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Insert Title: ");
        String title = s.nextLine();

        System.out.print("Insert author: ");
        String author = s.nextLine();

        System.out.print("Insert price: ");
        int price = s.nextInt();

        book_repository book = new book_repository(title, author, price);

        System.out.println(book.getbook());

        s.close();
    }
}
