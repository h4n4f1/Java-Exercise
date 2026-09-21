package OOP;

class Employee2 {
    String name;
    int baseSalary;

    public Employee2(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

class Manager extends Employee2 {
    int bonus;

    public Manager(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public int getSalary() {
        int salary = baseSalary + bonus;
        return salary;
    }
}


public class ManagerSalaryCalculation {
    public static void main(String[] args) {
        Manager m = new Manager("Sunita", 60000, 15000);
        System.out.println("Manager: " + m.name + ", Total Salary: " + m.getSalary());
    }
}
