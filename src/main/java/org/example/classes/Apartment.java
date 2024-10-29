package org.example.classes;

public class Apartment extends Residential{
    private boolean isFreehold;
    private int groundRent;
    private int serviceCharge;
    private String floor;

    @Override
    public int estimateBills() {
        return super.estimateBills() + groundRent + serviceCharge;
    }
}
