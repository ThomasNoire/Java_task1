package org.example;

import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;

    public Order(Cart cart) {
        this.products = cart.getProducts(); // Використання геттера замість прямого доступу
        this.totalPrice = cart.getTotalPrice();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order details:\n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Total Order Price: ").append(totalPrice);
        return sb.toString();
    }
}
