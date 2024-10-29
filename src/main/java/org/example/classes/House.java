package org.example.classes;

public class House extends Residential {
    private String houseType;
    private boolean garden;
    private boolean garage;
    private int numberOfFloors;


    public House(String houseType, boolean garden, boolean garage, int numberOfFloors) {
        this.setHouseType(houseType);
        this.setGarden(garden);
        this.setGarage(garage);
        this.setNumberOfFloors(numberOfFloors);
    }

    public House() {
        this("UNKNOWN HOUSE TYPE", false, false, 0);
    }


    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public int estimateBills() {
        return super.estimateBills() * numberOfFloors;
    }
}
