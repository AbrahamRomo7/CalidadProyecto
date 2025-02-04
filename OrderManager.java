// OrderManager.java
import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(String customer, String orderDetail) {
        Order order = new Order(customer, orderDetail);
        orders.add(order);
        System.out.println("Order added for " + customer);
    }

    public void listOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        OrderManager om = new OrderManager();
        om.addOrder("Alice", "Laptop");
        om.addOrder("Bob", "Phone");
        om.listOrders();
    }
}
