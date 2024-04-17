package HW17;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private int quantity;

    private static List<Product> products = new ArrayList<>();

    // Конструктор класу для ініціалізації товару
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        products.add(this); // Додати поточний продукт до списку продуктів
    }

    public static int getTotalQuantity() {
        int total = 0;
        for (Product product : products) {
            total += product.getQuantity();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
