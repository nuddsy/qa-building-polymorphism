package org.example.classes;

public class Apartment extends Residential{
    private boolean isFreehold;
    private int groundRent;
    private int serviceCharge;
    private String floor;


    public Apartment(boolean isFreehold, int groundRent, int serviceCharge, String floor) {
        this.setFreehold(isFreehold);
        this.setGroundRent(groundRent);
        this.setServiceCharge(serviceCharge);
        this.setFloor(floor);

    }

    public Apartment() {
        this(false, 0, 0, "UNKNOWN FLOOR");
    }


    public boolean isFreehold() {
        return isFreehold;
    }

    public void setFreehold(boolean freehold) {
        isFreehold = freehold;
    }

    public int getGroundRent() {
        return groundRent;
    }

    public void setGroundRent(int groundRent) {
        this.groundRent = groundRent;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public int estimateBills() {
        return super.estimateBills() + groundRent + serviceCharge;
    }

    @Override
    public String getAddress() {
        return "Floor " + floor + ", " + super.getAddress();
    }
}
