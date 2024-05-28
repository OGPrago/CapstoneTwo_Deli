package com.ps;

public abstract class Product {

    private float price;

    public Product(float price) {
        this.price = price;
    }

    public abstract String getName();

    public abstract float calcPrice();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
