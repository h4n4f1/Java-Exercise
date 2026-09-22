package OOP;

class Worker {
    public double calculatePay() {
        return 0;
    }
}

class SalariedWorker extends Worker {
    private double salary;

    public SalariedWorker(int salary) {
        this.salary = salary;
    }

    @Override 
    public double calculatePay() {
        return salary;
    }
}

class HourlyWorker extends Worker {
    private double hours;
    private double pay;

    public HourlyWorker(double hours, double pay) {
        this.hours = hours;
        this.pay = pay;

    }

    @Override
    public double calculatePay() {
        return pay * hours;
    }
}

public class PayrollCalculation {
    public static void main(String[] args) {
        Worker w1 = new SalariedWorker(50000); 
        Worker w2 = new HourlyWorker(25, 160);
        System.out.println("Salaried pay: " + w1.calculatePay());
        System.out.println("Hourly pay: " + w2.calculatePay());
    }
}
