package org.example.classes;

import org.example.classes.enums.WEEKDAYS;

public abstract class Building {
    private int price;
    private int sqFootage;
    private WEEKDAYS binDay;

    public abstract int estimateBills();

    public abstract String getAddress();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSqFootage() {
        return sqFootage;
    }

    public void setSqFootage(int sqFootage) {
        this.sqFootage = sqFootage;
    }

    public WEEKDAYS getBinDay() {
        return binDay;
    }

    public void setBinDay(WEEKDAYS binDay) {
        this.binDay = binDay;
    }



}
