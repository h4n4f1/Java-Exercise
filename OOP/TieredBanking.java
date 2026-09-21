package OOP;

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * (interestRate / 100);
        System.out.println("New balance after interest: " + balance);
    }


}

public class TieredBanking {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1000, 5); 
        acc.applyInterest();
    }
}
