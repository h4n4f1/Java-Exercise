package OOP;

class Car {
    String make;
    String model;
    int currentSpeed;

    public Car (String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void accelerate(int speed) {
        this.currentSpeed += speed;
        System.out.println("Speed increased to " + this.currentSpeed);
    }

    public void brake(int speed) {
        if (speed > this.currentSpeed) {
            this.currentSpeed = 0;
            System.out.println("Speed cannot go below 0. Speed set to 0");
            return;
        }
        this.currentSpeed -= speed;
        System.out.println("Speed decreased to " + this.currentSpeed);
    }
}

public class CarDashboard {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla"); 
        car.accelerate(20); 
        car.brake(30);
    }
}
