package OOP;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
        System.out.println("Updated salary for " + this.name + ": " + salary);
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Priya", 50000); 
        emp.raiseSalary(10);
    }
}
