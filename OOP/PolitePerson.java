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

class Student extends Person {
    String grade;

    public Student(String name, String grade){
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
        Student s = new Student("Amit", "10th Grade"); 
        s.displayDetails();
    }
}
