package OOP;

class Product {
    int productID;
    String name;
    int quantityInStock;

    public Product(int productID, String name, int quantityInStock) {
        this.productID = productID;
        this.name = name;
        this.quantityInStock = quantityInStock;
    }

    public void addStock(int quantity) {
        this.quantityInStock += quantity;
    }

    public void sellProduct(int quantity) {
        if (quantity > this.quantityInStock) {
            System.out.println("Not enough stock. Only " + this.quantityInStock + " units available.");
            return;
        }
        System.out.println(this.quantityInStock + " sold.");
    }
}

public class InventoryItem {
    public static void main(String[] args) {
        Product p = new Product(1, "Notebook", 10); 
        p.sellProduct(15);
    }
}
