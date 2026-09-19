package OOP;

class Smartphone {
    private String brand;
    private int ram;
    private int storage;

    public Smartphone setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Smartphone setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    public Smartphone setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB, Storage: " + storage + "GB");
    }
}

public class SmartphoneConfigurator {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone(); 
        myPhone.setBrand("Pixel").setRAM(8).setStorage(128);
        myPhone.display();

    }
}
