package OOP;

class Car1 {
    private static int totalCarsCreated;
    private String brand;

    public Car1(String brand) {
        totalCarsCreated++;
        this.brand = brand;
    }

    public static int displayCounter() {
       return totalCarsCreated;
    }
}

public class InstanceCounter {
    public static void main(String[] args) {
        Car1 c1 = new Car1("Honda"); 
        Car1 c2 = new Car1("Ford"); 
        Car1 c3 = new Car1("Kia");
        
        System.out.println("Total cars created: " + Car1.displayCounter());
    }
}
