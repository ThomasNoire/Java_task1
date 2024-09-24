package org.example;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Order {
    private List<Product> products;
    private double totalPrice;

    public Order(Cart cart) {
        this.products = cart.getProducts(); // Використання геттера замість прямого доступу
        this.totalPrice = cart.getTotalPrice();
    }
}
