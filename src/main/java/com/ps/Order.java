package com.ps;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void checkOut() {
        System.out.println("Order Summary:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.calcPrice());
        }
    }
}
