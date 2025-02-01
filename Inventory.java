import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Quantity: " + quantity + ", Price: $" + price;
    }
}

public class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, int quantity, double price) {
        Product product = new Product(name, quantity, price);
        products.add(product);
        System.out.println("Product added: " + product);
    }

    public void printInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Laptop", 5, 1000.0);
        inventory.addProduct("Smartphone", 10, 500.0);
        inventory.printInventory();
    }
}
