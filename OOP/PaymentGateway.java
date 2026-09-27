package OOP;

interface PaymentProcessor {
    public void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " via Credit Card");
    }
}

class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " via PayPal");
    }
}

class CryptoProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " via Crypto");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor[] processors = { new CreditCardProcessor(), new PayPalProcessor(), new CryptoProcessor() }; 
        for (PaymentProcessor p : processors) { p.processPayment(100); }
    }
}
