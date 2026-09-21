package OOP;

class Item {
    protected String name;
    protected double price;

    public Item (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Item: " + name + ", Price: " + price);
    }
}

class PerishableItem extends Item {
    private String expirationDate;

    public PerishableItem(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public void storageAlert() {
        System.out.println("Store in refrigerator. Expires on " + expirationDate);
    }
}

public class GroceryStock {
    public static void main(String[] args) {
        PerishableItem milk = new PerishableItem("Milk", 3.5, "2026-07-05");
        milk.display();
        milk.storageAlert();
    }
}
