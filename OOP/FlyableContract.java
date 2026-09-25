package OOP;

interface Flyable {
    public void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("The bird flaps its wings to fly.");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("The airplane uses jet engines to fly.");
    }
}

public class FlyableContract {
    public static void main(String[] args) {
        Flyable b = new Bird(); 
        Flyable a = new Airplane(); 
        b.fly(); 
        a.fly();
    }
}
