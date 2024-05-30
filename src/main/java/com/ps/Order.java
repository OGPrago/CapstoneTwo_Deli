package com.ps;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void checkOut() {
        System.out.println("Your Order:");
        float totalPrice = 0f;
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.calcPrice());
            totalPrice += product.calcPrice();
        }
        System.out.println("Total Price: $" + calculateTotalPrice());
    }

    public float calculateTotalPrice() {
        float totalPrice = 0f;
        for (Product product : products) {
            totalPrice += product.calcPrice();
        }
        return totalPrice;
    }
}
