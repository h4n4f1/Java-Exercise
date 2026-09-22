package OOP;

class Animal {
     public void makeSound() {
        System.out.println("Animal makes a sound");
     }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
     }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Awoo");
     }
}

public class AnimalChorus {
    public static void main(String[] args) {
        Animal[] animals = { new Cat(), new Dog() }; 
        for (Animal a : animals) { 
            a.makeSound(); 
        }
    }
}
