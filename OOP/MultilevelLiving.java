package OOP;

class Animal1 {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal1 {
    public void walk() {
        System.out.println("This mammal walks on land.");
    }
}

class Dog1 extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelLiving {
    public static void main(String[] args) {
        Dog1 d = new Dog1(); 
        d.eat(); 
        d.walk(); 
        d.bark();
    }
}
