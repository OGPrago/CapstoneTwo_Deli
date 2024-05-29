package com.ps;

public class Drink extends Product {

    private String drinkName;
    private String drinkSize;

    public Drink(float price, String drinkName, String drinkSize) {
        super(price);
        this.drinkName = drinkName;
        this.drinkSize = drinkSize;
    }

    @Override
    public String getName() {
        return drinkName + " (" + drinkSize + ")";
    }

    @Override
    public float calcPrice() {
        return getPrice();
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
