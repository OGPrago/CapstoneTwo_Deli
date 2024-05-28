package com.ps;

public class Chips extends Product {
    public Chips(float price) {
        super(price);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public float calcPrice() {
        return 0;
    }
}
