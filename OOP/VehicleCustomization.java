package OOP;

class Vehicle {
    String brand;
    int year;

    public void setVehicle (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Bike extends Vehicle {
    String handlebarType;

    public Bike(String brand, int year, String handlebarType) {
        super.setVehicle(brand, year);
        this.handlebarType = handlebarType;
    }

    public void display() {
        System.out.println("Brand: " + this.brand + ", Year: " + this.year + ", Handlebar: " + handlebarType);
    }
}

public class VehicleCustomization {
    public static void main(String[] args) {
        Bike b = new Bike("Yamaha", 2023, "Sport");
        b.display();
    }
}
