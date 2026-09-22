package OOP;

abstract class Appliance {
    public abstract void turnOn();
    public abstract void turnOff();
}

class AirConditioner extends Appliance {
    private int temperature;

    public AirConditioner(int temperature) {
        this.temperature = temperature;
    }

    @Override 
    public void turnOn() {
        System.out.println("AC turned on. Temperature set to" + temperature + " degrees.");
    }

    @Override 
    public void turnOff() {
        System.out.println("AC turned off.");
    }
    
}

public class ApplianceControl {
    public static void main(String[] args) {
        Appliance ac = new AirConditioner(22); 
        ac.turnOn(); 
        ac.turnOff();
    }
}
