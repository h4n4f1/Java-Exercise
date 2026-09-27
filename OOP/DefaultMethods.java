package OOP;

interface Vehicle1 {
    abstract void accelerate();
    default void soundHorn() {
        System.out.println("bip bip!");
    }
}

class Motorcycle implements Vehicle1 {
    public void accelerate() {
        System.out.println("Motorcycle accelerating.");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        Vehicle1 v = new Motorcycle(); 
        v.accelerate(); 
        v.soundHorn();
    }
}
