package org.example.classes;

public class Residential {

    private char epcRating;
    private char councilTaxBand;

    private String address;


    public Residential(char epcRating, char councilTaxBand, String address) {
        this.setEpcRating(epcRating);
        this.setCouncilTaxBand(councilTaxBand);
        this.setAddress(address);
    }

    public Residential() {
        this('?', '?',"UNKNOWN ADDRESS");
    }

    public int estimateBills(){
        return 100;
    }

    public char getEpcRating() {
        return epcRating;
    }
    public void setEpcRating(char epcRating) {
        this.epcRating = epcRating;
    }

    public char getCouncilTaxBand() {
        return councilTaxBand;
    }

    public void setCouncilTaxBand(char councilTaxBand) {
        this.councilTaxBand = councilTaxBand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
