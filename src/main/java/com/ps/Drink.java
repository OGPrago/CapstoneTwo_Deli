package com.ps;

public class Drink extends  Product {

    private String drinkSize;

    public Drink(float price, String drinkSize) {
        super(price);
        this.drinkSize = drinkSize;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public float calcPrice() {
        return 0;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }
}
