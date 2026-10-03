package OOP;

enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
}

class Order {
    OrderStatus orderStatus;

    Order(OrderStatus p) {
        this.orderStatus = p; 
    }

    public boolean canCancel() {
        return orderStatus == OrderStatus.PENDING;
    }
}

public class enumsWIthOOP {
    public static void main(String[] args) {
        Order o1 = new Order(OrderStatus.PENDING); 
        Order o2 = new Order(OrderStatus.SHIPPED);  
        System.out.println(o1.canCancel()); 
        System.out.println(o2.canCancel());
    }
}
