package OOP;
import java.util.Scanner;

class BankAccount {
    protected double balance = 0;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
            if (this.balance < amount) {
                System.out.println("Insufficient funds. Withdrawal denied.");
                return;
            }
            this.balance -= amount;
            System.out.println("withdrawn: " + amount);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        this.balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + this.balance);
    }
}

public class SecureBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);

        Scanner s = new Scanner(System.in);

        System.out.println("Press 1 - Deposit");
        System.out.println("Press 2 - Withdraw");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.print("insert amount to deposit: ");
                double amount = s.nextDouble();
                acc.deposit(amount);
                break;
            case 2:
                System.out.print("insert amount to withdraw: ");
                double amount1 = s.nextDouble();
                acc.withdraw(amount1);
                break;
            default:
                System.out.print("invalid number");
        }

        s.close();
    }
}
