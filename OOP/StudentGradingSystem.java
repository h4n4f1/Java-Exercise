package OOP;

class Student {
    int[] marks = new int[3];

    public Student (int[] marks) {
        this.marks = marks;
    }

    public double getAverage() {
        int x = 0;
        double sum = 0;

        while (x < 5) {
            sum += marks[x];
            x++;
        }

        double average = sum / 5;
        return average;
    }

    public String getStatus() {
        if (getAverage() > 40) {
            return "Pass";
        }
        return "Fail";
    }

}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Student s = new Student(new int[]{80, 45, 60, 90, 35});
        System.out.println("Average = " + s.getAverage());
        System.out.println("Status = " + s.getStatus());
    }
}
