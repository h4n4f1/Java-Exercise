package OOP;

class Patient {
    String name;
    int age;
    String illness;

    Patient() {
        this("Unknown");
    }

    Patient(String name) {
        this(name, 0);
    }

    Patient(String name, int age) {
        this(name, age, "Not specified");
    }

    Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public void display() {
        System.out.println("Patient: " + this.name + ", Age: " + this.age + ", Illness: " + this.illness);
    }
}

public class PatientAdmission {
    public static void main(String[] args) {
        Patient p1 = new Patient(); 
        Patient p2 = new Patient("Rahul"); 
        Patient p3 = new Patient("Anita", 34, "Fever");

        p1.display();
        p2.display();
        p3.display();
    }
}
