package OOP;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("name: " + name);
    }
}

class Student1 extends Person {
    String grade;

    public Student1(String name, String grade){
        super(name);
        this.grade = grade;
    }

    @Override public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

public class PolitePerson {
    public static void main(String[] args) {
        Student1 s = new Student1("Amit", "10th Grade"); 
        s.displayDetails();
    }
}
