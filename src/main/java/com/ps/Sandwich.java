package com.ps;

public class Sandwich extends Product {

    private String breadType;
    private byte breadSize;
    private String meatType;
    private String cheeseType;
    private String toppings;
    private String sauces;
    private boolean extra;
    private boolean isToasted;

    public Sandwich(
            float price,
            String breadType,
            byte breadSize,
            String meatType,
            String cheeseType,
            String toppings,
            String sauces,
            boolean extra,
            boolean isToasted
    ) {
        super(price);
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.meatType = meatType;
        this.cheeseType = cheeseType;
        this.toppings = toppings;
        this.sauces = sauces;
        this.extra = extra;
        this.isToasted = isToasted;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public float calcPrice() {
        return 0;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public byte getBreadSize() {
        return breadSize;
    }

    public void setBreadSize(byte breadSize) {
        this.breadSize = breadSize;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setIsToasted(boolean toasted) {
        isToasted = toasted;
    }
}
