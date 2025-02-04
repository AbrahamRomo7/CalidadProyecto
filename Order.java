// Order.java
public class Order {
    private String customer;
    private String orderDetail;

    public Order(String customer, String orderDetail) {
        this.customer = customer;
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Customer: " + customer + ", Order: " + orderDetail;
    }
}
