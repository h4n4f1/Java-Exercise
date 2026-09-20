package OOP;

class Parent {
    int value = 1;
}

class Child extends Parent {
    int value = 2;

    public void showValues() {
        System.out.println("Parent value: " + super.value);
        System.out.println("Child value: " + this.value);
    }
}

public class VariableShadowingResolution {
    public static void main(String[] args) {
        Child c = new Child(); 
        c.showValues();
    }
}
