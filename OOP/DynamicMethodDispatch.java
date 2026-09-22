package OOP;

class Printer {
    public void printDocument () {
        System.out.println("Printing with printer technology.");
    }
}

class LaserPrinter extends Printer {
    @Override
    public void printDocument () {
        System.out.println("Printing with Laser technology.");
    }
}

class InkjetPrinter extends Printer {
    @Override
    public void printDocument () {
        System.out.println("Printing with inkjet technology.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Printer p = new LaserPrinter(); 
        p.printDocument(); 
        p = new InkjetPrinter(); 
        p.printDocument();
    }
}
