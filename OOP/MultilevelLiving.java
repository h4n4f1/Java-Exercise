package OOP;

class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("This mammal walks on land.");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelLiving {
    public static void main(String[] args) {
        Dog d = new Dog(); 
        d.eat(); 
        d.walk(); 
        d.bark();
    }
}
