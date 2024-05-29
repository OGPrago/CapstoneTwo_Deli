package com.ps;

import java.util.ArrayList;

public class Chips extends Product {

    private String chipsSize;
    private String chipsName;
    ArrayList<String> chips = new ArrayList<>();

    public Chips(float price, String chipsName, String chipsSize) {
        super(price);
        this.chipsName = chipsName;
        this.chipsSize = chipsSize;
    }

    @Override
    public String getName() {
        return chipsName + " (" + chipsSize + ")";
    }

    @Override
    public float calcPrice() {
        return getPrice();
    }


    public String getChipsSize() {
        return chipsSize;
    }

    public void setChipsSize(String chipsSize) {
        this.chipsSize = chipsSize;
    }

    public void addChip(String chip) {
        chips.add(chip);
    }
}
