package OOP;
import java.util.List;
import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    String name;
    List<Professor> professors;

    Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor p) {
         professors.add(p);
    }

    public void listProfessors() {
        System.out.println(name + " professors:");
        for (Professor p : professors) {
            System.out.println(p.getName());
        }
    }

}

public class UniversitySetup {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Rao"); 
        Professor p2 = new Professor("Dr. Iyer"); 
        Department cs = new Department("Computer Science"); 
        cs.addProfessor(p1); 
        cs.addProfessor(p2); 
        cs.listProfessors();
    }
}
