package OOP;

class Computer {
    Processor processor;
    GraphicsCard graphicsCard;

    Computer() {
        this.processor = new Processor();
        this.graphicsCard = new GraphicsCard();
    }

    public void showSpecs() {
        System.out.println("Processor: " + processor.getModel());
        System.out.println("Graphics Card: " + graphicsCard.getModel());
    }
}

class Processor {
    String model = "Ryzen 9 5900HX";

    public String getModel() {
        return model;
    }
}

class GraphicsCard {
    String model = "RX 6800M";

    public String getModel() {
        return model;
    }
}

public class Composition {
    public static void main(String[] args) {
        Computer pc = new Computer(); 
        pc.showSpecs();
    }
}
