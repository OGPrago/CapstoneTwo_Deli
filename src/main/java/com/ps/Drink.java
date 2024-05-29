package com.ps;

public class Drink extends  Product {

    private String drinkSize;
    private String drinkName;

    public Drink(float price, String drinkSize, String drinkName) {
        super(price);
        this.drinkSize = drinkSize;
        this.drinkName = drinkName;
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

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
}
