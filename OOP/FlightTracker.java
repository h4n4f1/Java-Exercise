package OOP;

class Flight {
    private static int counter = 0;
    private String ID;

    public Flight() {
        counter++;
        this.ID = "FL-" + counter;
    }

    public String getTrackingId() {
        return ID;
    }

}

public class FlightTracker {
    public static void main(String[] args) {
        Flight f1 = new Flight(); 
        Flight f2 = new Flight(); 
        Flight f3 = new Flight();

        System.out.println("Tracking ID: " + f1.getTrackingId());
        System.out.println("Tracking ID: " + f2.getTrackingId());
        System.out.println("Tracking ID: " + f3.getTrackingId());

    }
}
