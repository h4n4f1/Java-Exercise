package OOP;

abstract class Employee {
    abstract void displayName();
}

interface Taxable {
    public void calculateTax();
}

class FullTimeEmployee extends Employee implements Taxable {
    String name;
    double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayName() {
        System.out.println("Employee: " + name);
    }

    public void calculateTax() {
        System.out.println("Tax owed: " + this.salary * 0.2);
    }
}

public class TaxCompliance {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Karan", 80000); 
        emp.displayName(); 
        emp.calculateTax();
    }
}
