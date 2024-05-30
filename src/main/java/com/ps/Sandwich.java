package com.ps;

public class Sandwich extends Product {
    private String breadSize;
    private String breadType;
    private String meatType;
    private boolean extraMeat;
    private String cheeseType;
    private boolean extraCheese;
    private String regularToppings;
    private String sauces;
    private String sides;

    public Sandwich(
            String breadSize,
            String breadType,
            String meatType,
            boolean extraMeat,
            String cheeseType,
            boolean extraCheese,
            String regularToppings,
            String sauces,
            String sides
    ) {
        super(0);
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.meatType = meatType;
        this.extraMeat = extraMeat;
        this.cheeseType = cheeseType;
        this.extraCheese = extraCheese;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.sides = sides;
        setPrice(calcPrice());
    }

    @Override
    public String getName() {
        return breadSize + " " + breadType + " sandwich with " + meatType + " and " + cheeseType;
    }

    @Override
    public float calcPrice() {
        float basePrice = 0;
        float meatPrice = 0;
        float cheesePrice = 0;

        switch (breadSize) {
            case "4\"":
                basePrice = 5.50f;
                break;
            case "8\"":
                basePrice = 7.00f;
                break;
            case "12\"":
                basePrice = 8.50f;
                break;
        }

        if (extraMeat) {
            if (breadSize.equals("4\"")) {
                meatPrice += 0.50f;
            } else if (breadSize.equals("8\"")) {
                meatPrice += 1.00f;
            } else if (breadSize.equals("12\"")) {
                meatPrice += 1.50f;
            }
        }

        if (extraCheese) {
            if (breadSize.equals("4\"")) {
                cheesePrice += 0.30f;
            } else if (breadSize.equals("8\"")) {
                cheesePrice += 0.60f;
            } else if (breadSize.equals("12\"")) {
                cheesePrice += 0.90f;
            }
        }

        switch (breadSize) {
            case "4\"":
                meatPrice += 1.00f;
                cheesePrice += 0.75f;
                break;
            case "8\"":
                meatPrice += 2.00f;
                cheesePrice += 1.50f;
                break;
            case "12\"":
                meatPrice += 3.00f;
                cheesePrice += 2.25f;
                break;
        }

        return basePrice + meatPrice + cheesePrice;
    }

    public String getBreadSize() {
        return breadSize;
    }

    public void setBreadSize(String breadSize) {
        this.breadSize = breadSize;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public String getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(String regularToppings) {
        this.regularToppings = regularToppings;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }
}
