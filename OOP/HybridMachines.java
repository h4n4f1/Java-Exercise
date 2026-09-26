package OOP;

interface Drivable {
    public void startEngine() ;
    public void stopEngine() ;
}

interface Watercraft {
    public void dock();
}

class AmphibiousVehicle implements Drivable, Watercraft {

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Docking at the harbor.");
    }

    public void dock() {
        System.out.println("Engine stopped.");
    }

}

public class HybridMachines {
    public static void main(String[] args) {
        AmphibiousVehicle v = new AmphibiousVehicle(); 
        v.startEngine(); 
        v.dock(); 
        v.stopEngine();
    }
}
