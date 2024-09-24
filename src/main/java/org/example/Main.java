package org.example;

public class Main {
    public static void main(String[] args) {
        // Створення категорій і товарів...
        Category electronics = new Category(1, "Electronics");
        Product laptop = new Product(1, "Laptop", 999.99, "High-performance laptop");
        Product smartphone = new Product(2, "Смартфон", 12999.50, "Смартфон з великим екраном…");
        Product headphones = new Product(3, "Навушники", 2499.00, "Бездротові навушники з шумозаглушенням");

        Cart cart = new Cart();

        cart.addProduct(laptop);
        cart.addProduct(smartphone);
        cart.addProduct(headphones);

        System.out.println(cart);

        Order order = new Order(cart);
        System.out.println(order);
    }
}
